package com.nutiteq.android;

import android.os.Handler;
import android.os.Message;

public class RepaintHandler extends Handler {
  private MapView mapView;

  public RepaintHandler(final MapView mapView) {
    this.mapView = mapView;
  }

  @Override
  public void handleMessage(final Message msg) {
	if (mapView != null) { // already cleaned ?
      mapView.invalidate();
	}
    super.handleMessage(msg);
  }

  public void clean() {
    mapView = null;
  }
}
