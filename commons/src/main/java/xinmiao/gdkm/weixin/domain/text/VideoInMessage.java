package xinmiao.gdkm.weixin.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import xinmiao.gdkm.weixin.domain.InMessage;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD) // 字段获取信息
public class VideoInMessage extends InMessage {
	@XmlElement(name = "MediaId")
	private String mediaId; // 视频消息媒体id，可以调用获取临时素材接口拉取数据。
	@XmlElement(name = "ThumbMediaId")
	private String thumbMediaId; // 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		return "VideoInMessage [mediaId=" + mediaId + ", thumbMediaId=" + thumbMediaId + ", getToUserName()="
				+ getToUserName() + ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
