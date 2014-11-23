package ch.swisscom.phisherman.model;

public class UrlCheckResult {

	public String pageTitle;
	public String url;
	
	public UrlCheckResult(String pageTitle, String url) {
		this.pageTitle = pageTitle;
		this.url = url;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public String getUrl() {
		return url;
	}
}
