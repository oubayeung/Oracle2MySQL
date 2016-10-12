package com.ninemax.entity;

import java.io.Serializable;

public class Journal implements Serializable{

	private long journalId;
	private String journalName;
	private long articleCount;
	private long authorCount;
	private long chinaAuthorCount;
	private long otherAuthorCount;
	private long chinaArticleCount;
	
	public long getJournalId() {
		return journalId;
	}
	public void setJournalId(long journalId) {
		this.journalId = journalId;
	}
	public String getJournalName() {
		return journalName;
	}
	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}
	public long getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(long articleCount) {
		this.articleCount = articleCount;
	}
	public long getAuthorCount() {
		return authorCount;
	}
	public void setAuthorCount(long authorCount) {
		this.authorCount = authorCount;
	}
	public long getChinaAuthorCount() {
		return chinaAuthorCount;
	}
	public void setChinaAuthorCount(long chinaAuthorCount) {
		this.chinaAuthorCount = chinaAuthorCount;
	}
	public long getOtherAuthorCount() {
		return otherAuthorCount;
	}
	public void setOtherAuthorCount(long otherAuthorCount) {
		this.otherAuthorCount = otherAuthorCount;
	}
	public long getChinaArticleCount() {
		return chinaArticleCount;
	}
	public void setChinaArticleCount(long chinaArticleCount) {
		this.chinaArticleCount = chinaArticleCount;
	}
	
	
}
