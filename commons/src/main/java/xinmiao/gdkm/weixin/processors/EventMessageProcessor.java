package xinmiao.gdkm.weixin.processors;

import xinmiao.gdkm.weixin.domain.text.EventInMessage;

public interface EventMessageProcessor {

	void onMessage(EventInMessage msg);
}
