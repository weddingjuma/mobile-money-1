package com.wk.mobile.money.client.event;

import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class CategoriesEvent extends Event<CategoriesEvent.Handler> {

  public static Type<Handler> TYPE = new Type<Handler>();

	public interface Handler {
		void onEvent(CategoriesEvent event);
	}

	public static void fire(EventBus eventBus) {
		eventBus.fireEvent(new CategoriesEvent());
	}

	public static HandlerRegistration register(EventBus eventBus, Handler handler) {
		return eventBus.addHandler(TYPE, handler);
	}

	@Override
  public Type<Handler> getAssociatedType() {
    return TYPE;
  }

	@Override
	protected void dispatch(Handler handler) {
		handler.onEvent(this);
	}


}
