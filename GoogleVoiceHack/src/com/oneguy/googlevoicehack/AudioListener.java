package com.oneguy.googlevoicehack;

import java.nio.ByteBuffer;

public interface AudioListener {
	public void onAudioData(ByteBuffer buffer);
}
