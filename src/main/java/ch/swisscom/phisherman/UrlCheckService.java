package ch.swisscom.phisherman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import ch.swisscom.phisherman.model.UrlCheckResult;

public class UrlCheckService {

	WebDriver driver = new HtmlUnitDriver();

	public UrlCheckResult checkUrl(String url) {
		driver.get(url);
		return new UrlCheckResult(driver.getTitle(), driver.getCurrentUrl());
	}
}
