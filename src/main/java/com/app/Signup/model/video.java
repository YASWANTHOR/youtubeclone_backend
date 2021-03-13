package com.app.Signup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class video {
	@Id
	
	private int id;
	private String videoName;
	private String videoImage;
	private String channelName;
	private String channelLogo;
	private String uploadInfo;
	private int views;
	
	
	public video() {
		
	}
	public video(int id, String videoName, String videoImage, String channelName, String channelLogo, String uploadInfo,
			int views) {
		super();
		this.id = id;
		this.videoName = videoName;
		this.videoImage = videoImage;
		this.channelName = channelName;
		this.channelLogo = channelLogo;
		this.uploadInfo = uploadInfo;
		this.views = views;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getVideoImage() {
		return videoImage;
	}
	public void setVideoImage(String videoImage) {
		this.videoImage = videoImage;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelLogo() {
		return channelLogo;
	}
	public void setChannelLogo(String channelLogo) {
		this.channelLogo = channelLogo;
	}
	public String getUploadInfo() {
		return uploadInfo;
	}
	public void setUploadInfo(String uploadInfo) {
		this.uploadInfo = uploadInfo;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	
	
}