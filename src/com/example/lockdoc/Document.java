package com.example.lockdoc;

import android.annotation.SuppressLint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Document {

	/*
	 * Document Object for LocDoc Data Model for Database
	 */
	private long id;
	private String filename;
	private String docType;
	private String uploadDate;
	private String privacy;
	private String description;
	private String path;

	public Document(String filename, String type) {
		Date docDate = new Date();
		this.uploadDate = formatUploadDate(docDate);
		this.filename = filename;
		this.docType = type;
	}

	public Document(long id, String filename, String type, String uploadDate,
			String description, String privacy, String path) {
		this.id = id;
		this.filename = filename;
		this.docType = type;
		this.uploadDate = uploadDate;
		this.setDescription(description);
		this.setPrivacy(privacy);
		this.setPath(path);
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	@SuppressLint("SimpleDateFormat")
	public String formatUploadDate(Date docDate) {
		// returns a formatted string rather than a Date object
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(docDate);
	}

	public String getUploadDate() {
		return this.uploadDate;
	}

	public long getID() {
		return this.id;
	}

	public void setID(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		// only 3 options for privacy
		if (privacy.equals("Locked Up"))
			this.privacy = privacy;
		else
			this.privacy = "Shareable";
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
