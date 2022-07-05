/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.datatransform.adapters.DataTransformAction;
import com.ibm.rational.test.lt.datatransform.adapters.IDataTransform;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class SearchAndProductDetails_Test_A1ECFBC447B5A289E519B06161363232 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	
	
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public SearchAndProductDetails_Test_A1ECFBC447B5A289E519B06161363232(IContainer container, String invocationId) {
		super(container, "Search and Product Details", invocationId, "A1ECFBC447B5A289E519B06161363232");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(dataTransform(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: SearchAndProductDetails_Test_A1ECFBC447B5A289E519B06161363232 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private KAction dataTransform(IContainer parent) {
		DataTransformAction action = 
			new DataTransformAction(parent, "Data Transform Action");

		action.setMapFile("A1ECFBC447B5A289E519B06161363232");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0
		// com.ibm.rational.test.lt.datatransform.adapters.impl.JsonAdapterVERSION_0

		return action;
	}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)("officedepot.com"),  // host name
					Integer.parseInt((String)("443")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"officedepot.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)("officedepot.com"),  // host name
					Integer.parseInt((String)("80")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"officedepot.com",  // unsubstituted host name
					Integer.parseInt((String)("80")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_3(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)("www.officedepot.com"),  // host name
					Integer.parseInt((String)("80")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"www.officedepot.com",  // unsubstituted host name
					Integer.parseInt((String)("80")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_4(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_4",
					(String)("www.officedepot.com"),  // host name
					Integer.parseInt((String)("443")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"www.officedepot.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_5(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)("api.officedepot.io"),  // host name
					Integer.parseInt((String)("443")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"api.officedepot.io",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4C189A07FE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Search", "A1ECFBB4C189A07FE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1ECFBB4C189A071E519B06161363232", true, false,
						"Config_5", "/services/splunkjslogger/beacon.gif?src=GRAPHQL%20API%20call%20for%20Persistent%20Banner%20failed.&severity=error&msg=%7B%20error%3A%20TypeError%3A%20Cannot%20read%20properties%20of%20null%20(reading%20%27simplecardByPath%27)%2C%20msg%3A%20%27GRAPHQL%20API%20to%20retrieve%20response%20for%20for%20Persistent%20Banner%20in%20Header%20App%20failed.%27%7D&pageUrl=undefined&isClient=true&glassboxUrl=undefined",	"/services/splunkjslogger/beacon.gif?src=GRAPHQL%20API%20call%20for%20Persistent%20Banner%20failed.&severity=error&msg=%7B%20error%3A%20TypeError%3A%20Cannot%20read%20properties%20of%20null%20(reading%20%27simplecardByPath%27)%2C%20msg%3A%20%27GRAPHQL%20API%20to%20retrieve%20response%20for%20for%20Persistent%20Banner%20in%20Header%20App%20failed.%27%7D&pageUrl=undefined&isClient=true&glassboxUrl=undefined", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_2(this, false, "A1ECFBB4C137AFE0E519B06161363232", true, false,
						"Config_4", "/styles/print.min.b06979a8c55fd07eb565.css",	"/styles/print.min.b06979a8c55fd07eb565.css", true, false), 519, 100, "A1ECFBB4C189A083E519B06161363232", 3);
				httpParallel.addRequest(2, request_3(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 120, 100, "A1ECFBB4C189EE90E519B06161363232", 3);
				httpParallel.addRequest(3, request_4(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/akam-sw.js",	"/akam-sw.js", true, false), 479, 100, "A1ECFBB4C1F0EDCEE519B06161363232", 3);
				httpParallel.addRequest(4, request_5(this, false, "A1ECFBB4C1F1D820E519B06161363232", true, false,
						"Config_5", "/services/predictsearch-service/api/2/?searchTerm=stapler",	"/services/predictsearch-service/api/2/?searchTerm=stapler", true, false), 481, 100, "A1ECFBB4C1F0EDCEE519B06161363232", 3);
				httpParallel.addRequest(3, request_6(this, false, "A1ECFBB4C1190450E519B06161363232", true, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 521, 100, "A1ECFBB4C1F1D82EE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C189A083E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C189A086E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/octet-stream");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C189EE90E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C189EE93E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1F0EDCEE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "468", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C1F0EDD1E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("id=4575eee0-1288-463d-80ba-707c30c152cd&tagId=11024&fullRefe");
strBuf_1.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2F&payload=%7B%22s");
strBuf_1.append("itePage%22%3A%7B%22enterpriseId%22%3A%221523082%22%2C%22cart");
strBuf_1.append("Subtotal%22%3A%220%22%2C%22trackingSource%22%3A%22gtm%22%2C%");
strBuf_1.append("22pageType%22%3A%22N%2FA%22%2C%22%22%3A%7B%22userId%22%3A%22");
strBuf_1.append("%22%2C%22emailHash%22%3A%22%22%2C%22marketing_channel%22%3A%");
strBuf_1.append("22In%20Progress%22%7D%7D%7D&isDeviceAccessGranted=false&cjUs");
strBuf_1.append("er=00000000-0000-0000-0000-000000000000&cookies=");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1ECFBB4C1F114D9E519B06161363232", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1F162F1E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Service-Worker", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "serviceworker", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C1F162F4E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1F1D82EE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C1F1D831E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1F1FF6DE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3077", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C1F1FF70E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_2.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_2.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_2.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1343232,2560,1401,25");
strBuf_2.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_2.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.90902849");
strBuf_2.append("3454,828475671615.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_2.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_2.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_2.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_2.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0");
strBuf_2.append(",0,0,-1,310,1;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_2.append("0,-1,622,0;-1,-1,1,0,-1,706,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-");
strBuf_2.append("1,219,0;-1,-1,1,0,-1,220,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1");
strBuf_2.append("18,0;-1,-1,1,0,-1,214,0;-1,-1,1,0,-1,427,0;-1,-1,1,0,-1,418,");
strBuf_2.append("0;-1,-1,1,0,-1,421,0;-1,-1,1,0,-1,511,0;-1,-1,1,0,-1,632,0;-");
strBuf_2.append("1,-1,1,0,-1,434,0;-1,-1,1,0,-1,360,0;-1,-1,1,0,-1,629,0;-1,-");
strBuf_2.append("1,1,0,-1,622,0;-1,2,-94,-108,0,1,5429,-2,0,0,310;1,3,5914,-2");
strBuf_2.append(",0,0,310;2,2,5923,-2,0,0,310;3,1,5925,-2,0,0,310;4,3,5926,-2");
strBuf_2.append(",0,0,310;5,2,5940,-2,0,0,310;6,1,5942,-2,0,0,310;7,3,5943,-2");
strBuf_2.append(",0,0,310;8,2,5947,-2,0,0,310;9,1,5949,-2,0,0,310;10,3,5950,-");
strBuf_2.append("2,0,0,310;11,2,5955,-2,0,0,310;12,1,5956,-2,0,0,310;13,3,595");
strBuf_2.append("7,-2,0,0,310;14,2,5962,-2,0,0,310;15,1,5963,-2,0,0,310;16,3,");
strBuf_2.append("5965,-2,0,0,310;17,2,5970,-2,0,0,310;18,1,5973,-2,0,0,310;19");
strBuf_2.append(",3,5975,-2,0,0,310;20,2,6024,-2,0,0,310;-1,2,-94,-110,0,3,10");
strBuf_2.append("05,548,91,310;1,1,1482,548,91;2,4,1485,548,91,310;3,2,1980,5");
strBuf_2.append("48,91,310;4,1,7522,606,91;5,1,7680,700,95;6,1,7872,743,91;7,");
strBuf_2.append("1,7984,744,91;8,1,8697,760,91;9,3,8699,760,91,-1;-1,2,-94,-1");
strBuf_2.append("17,-1,2,-94,-111,0,2642,-1,-1,-1;-1,2,-94,-109,0,2641,-1,-1,");
strBuf_2.append("-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-1");
strBuf_2.append("12,https://www.officedepot.com/-1,2,-94,-115,131209,61920,32");
strBuf_2.append(",2642,2641,0,198379,8699,0,1656951343231,14,17725,21,10,2954");
strBuf_2.append(",3,0,8701,184177,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb");
strBuf_2.append("4PXFz7+DbeBAQAAihL/yQjCOL6YLxCWQOcR0ftYh+kt/fh36KaHsUy7fZw1P");
strBuf_2.append("sym4M8lOnTgBTBppnuiJg9LcDz7SGQcdwWmXdmtXwaeYacKDR1GJc9Fe2mgl");
strBuf_2.append("X95tUdb05tv7yX6kRVZ1B3CP23ChAHdfklYRzgR5lNJK/tKzFANcJvFoo0gy");
strBuf_2.append("7R7GL5yYlMxKdGX5JNxXWA4Mwe9cH8veyEZ9oGEIkBE0EYqNeCnTTm4bnTHH");
strBuf_2.append("r3q6u1Ckmb00y1IP4o+/k6aC9hhVGsuYzWbs4f/GQdYa5ewnUGDSInCfU5ni");
strBuf_2.append("jGrgz5Ky6tAc1swIxfs6K7ji17kFZYApzLINjfUZCxdsO7TM8eanFMkGnPIc");
strBuf_2.append("S2S6dgM0L0HOmHQeWKqd6JtiCxGfOgqtNXsQfSR~-1~||1-ugvpNbGKzL-1-");
strBuf_2.append("10-1000-2||~-1,39489,121,-360798511,30261693,PiZtE,12258,11,");
strBuf_2.append("14,true-1,2,-94,-106,1,3-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,");
strBuf_2.append("0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-1");
strBuf_2.append("27,21321144241322243122-1,2,-94,-70,273720021;-851345892;dis");
strBuf_2.append(";,7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80,");
strBuf_2.append("5372-1,2,-94,-116,20148270-1,2,-94,-118,151999-1,2,-94,-129,");
strBuf_2.append("479507b7234c45186c995a034296add61e679bb70e95994997a64c22e9b0");
strBuf_2.append("d79c,1.5,769baa1e58c97f68e09ccec638eeebbd00639644b5049f8a3ec");
strBuf_2.append("95a8672a5b0cb,Google Inc. (Intel),ANGLE (Intel, Intel(R) UHD");
strBuf_2.append(" Graphics 630 Direct3D11 vs_5_0 ps_5_0, D3D11),95f5b71fe531f");
strBuf_2.append("867faa814bdd4050dd8057206d53ecec1163523560525884870,33-1,2,-");
strBuf_2.append("94,-121,;7;16;0\"}");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1ECFBB4C1F22654E519B06161363232", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(498, 1, parent, parent, "A1ECFBB4C3F1C6DEE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "stapler  - Office Depot", "A1ECFBB4C3F1C6DEE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_7(this, true, "A1ECFBB4C3F1C6D0E519B06161363232", true, true,
						"Config_4", "/catalog/search.do?Ntt=stapler",	"/catalog/search.do?Ntt=stapler", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_8(this, false, "A1ECFBB4C3F37487E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_9(this, false, "A1ECFBB4C3F37487E519B06161363232", true, false,
						"Config_4", "/akam-sw-policy.json",	"/akam-sw-policy.json", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_10(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/styles/od/compare.min.24ed94cf7a.css",	"/styles/od/compare.min.24ed94cf7a.css", true, false), 17, 100, "A1ECFBB4C3F37495E519B06161363232", 3);
				httpParallel.addRequest(2, request_11(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/js/od/csl.min.7e5ee1ef3d.js",	"/js/od/csl.min.7e5ee1ef3d.js", true, false), 608, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(3, request_12(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/styles/compare_bar.min.4a2940e846b7889ce3ee.css",	"/styles/compare_bar.min.4a2940e846b7889ce3ee.css", true, false), 47, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_13(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/styles/atc_subscribtion_lightbox.min.90f1733b8dcc72e86eb0.css",	"/styles/atc_subscribtion_lightbox.min.90f1733b8dcc72e86eb0.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_14(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/js/od/compare.min.03e7ab0c20.js",	"/js/od/compare.min.03e7ab0c20.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_15(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/js/od/skuList.min.5b3cf4947a.js",	"/js/od/skuList.min.5b3cf4947a.js", true, false), 142, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_16(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/js/od/localStorageCache.min.94b4cbf9c4.js",	"/js/od/localStorageCache.min.94b4cbf9c4.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_17(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/js/od/search.min.fd2ba1e358.js",	"/js/od/search.min.fd2ba1e358.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_18(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/js/od/protectionplans.min.8cd3245391.js",	"/js/od/protectionplans.min.8cd3245391.js", true, false), 991, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_19(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/js/od/intersectionObserver.min.2b1f47f53d.js",	"/js/od/intersectionObserver.min.2b1f47f53d.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_20(this, false, "A1ECFBB4C3F79383E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 611, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(3, request_21(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/5.gif",	"/images/us/od/reviews/v2/5.gif", true, false), 1264, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(4, request_22(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/4.gif",	"/images/us/od/reviews/v2/4.gif", true, false), 1266, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_23(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/3.gif",	"/images/us/od/reviews/v2/3.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_24(this, false, "A1ECFBB4C3F8CBFBE519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/2.gif",	"/images/us/od/reviews/v2/2.gif", true, false), 733, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(7, request_25(this, false, "A1ECFBB4C3F919D7E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/1.gif",	"/images/us/od/reviews/v2/1.gif", true, false), 767, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(5, request_26(this, false, "A1ECFBB4C3F79383E519B06161363232", false, false,
						"Config_4", "/images/us/od/common/check-green-v2.png",	"/images/us/od/common/check-green-v2.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_27(this, false, "A1ECFBB4C3F8CBFBE519B06161363232", true, false,
						"Config_4", "/images/us/od/common/info-blue.png",	"/images/us/od/common/info-blue.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_28(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/images/us/od/icon_same_day_delivery.png",	"/images/us/od/icon_same_day_delivery.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_29(this, false, "A1ECFBB4C3F45EE0E519B06161363232", true, false,
						"Config_4", "/images/us/od/common/eco_concious.jpg",	"/images/us/od/common/eco_concious.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_30(this, false, "A1ECFBB4C3F919D7E519B06161363232", true, false,
						"Config_4", "/images/us/od/common/eco_concious_recycle.jpg",	"/images/us/od/common/eco_concious_recycle.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_31(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/js/compare_bar.min.1b1cbd6e846d1fd8a95a.js",	"/js/compare_bar.min.1b1cbd6e846d1fd8a95a.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_32(this, false, "A1ECFBB4C3F79383E519B06161363232", false, false,
						"Config_4", "/js/atc_subscribtion_lightbox.min.05c42a9f3db82916891b.js",	"/js/atc_subscribtion_lightbox.min.05c42a9f3db82916891b.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_33(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=8&cachebuster=105939246",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=8&cachebuster=105939246", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_34(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 3484, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(5, request_35(this, false, "A1ECFBB4C3F79383E519B06161363232", true, false,
						"Config_4", "/js/sponsoredskus.chunk.min.0a16022d03cc65ca69aa.js",	"/js/sponsoredskus.chunk.min.0a16022d03cc65ca69aa.js", true, false), 3513, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(8, request_36(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 3523, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(9, request_37(this, false, "A1ECFBB4C45A7403E519B06161363232", true, false,
						"Config_5", "/services/predictsearch-service/api/2/;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?searchTerm=stapler",	"/services/predictsearch-service/api/2/;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?searchTerm=stapler", true, false), 1120, 100, "A1ECFBB4C4216250E519B06161363232", 3);
				httpParallel.addRequest(4, request_38(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 4514, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(4, request_39(this, false, "A1ECFBB4C3F60C90E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=8700486,8357591,6577047,605703,213448,339681,339801,8363762,108185,139179,4799412,8467734,8812004,588593,938678,2708301,479596,7890125,141747,239400,141981,593247,5318188,239384,258901,9652256,975266&mapBySkuId=true&pr=",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=8700486,8357591,6577047,605703,213448,339681,339801,8363762,108185,139179,4799412,8467734,8812004,588593,938678,2708301,479596,7890125,141747,239400,141981,593247,5318188,239384,258901,9652256,975266&mapBySkuId=true&pr=", true, false), 5044, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(3, request_40(this, false, "A1ECFBB4C3F52233E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 7891, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F1C6E2E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F1C6E5E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F37495E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3689", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F37498E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_3.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_3.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_3.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1343232,2560,1401,25");
strBuf_3.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_3.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.27558164");
strBuf_3.append("3137,828475671615.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_3.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_3.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_3.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_3.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0");
strBuf_3.append(",0,0,-1,310,1;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_3.append("0,-1,622,0;-1,-1,1,0,-1,706,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-");
strBuf_3.append("1,219,0;-1,-1,1,0,-1,220,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1");
strBuf_3.append("18,0;-1,-1,1,0,-1,214,0;-1,-1,1,0,-1,427,0;-1,-1,1,0,-1,418,");
strBuf_3.append("0;-1,-1,1,0,-1,421,0;-1,-1,1,0,-1,511,0;-1,-1,1,0,-1,632,0;-");
strBuf_3.append("1,-1,1,0,-1,434,0;-1,-1,1,0,-1,360,0;-1,-1,1,0,-1,629,0;-1,-");
strBuf_3.append("1,1,0,-1,622,0;-1,2,-94,-108,0,1,5429,-2,0,0,310;1,3,5914,-2");
strBuf_3.append(",0,0,310;2,2,5923,-2,0,0,310;3,1,5925,-2,0,0,310;4,3,5926,-2");
strBuf_3.append(",0,0,310;5,2,5940,-2,0,0,310;6,1,5942,-2,0,0,310;7,3,5943,-2");
strBuf_3.append(",0,0,310;8,2,5947,-2,0,0,310;9,1,5949,-2,0,0,310;10,3,5950,-");
strBuf_3.append("2,0,0,310;11,2,5955,-2,0,0,310;12,1,5956,-2,0,0,310;13,3,595");
strBuf_3.append("7,-2,0,0,310;14,2,5962,-2,0,0,310;15,1,5963,-2,0,0,310;16,3,");
strBuf_3.append("5965,-2,0,0,310;17,2,5970,-2,0,0,310;18,1,5973,-2,0,0,310;19");
strBuf_3.append(",3,5975,-2,0,0,310;20,2,6024,-2,0,0,310;-1,2,-94,-110,0,3,10");
strBuf_3.append("05,548,91,310;1,1,1482,548,91;2,4,1485,548,91,310;3,2,1980,5");
strBuf_3.append("48,91,310;4,1,7522,606,91;5,1,7680,700,95;6,1,7872,743,91;7,");
strBuf_3.append("1,7984,744,91;8,1,8697,760,91;9,3,8699,760,91,-1;10,1,8720,7");
strBuf_3.append("60,95;11,4,8935,760,95,-1;12,2,9533,760,95,-1;13,1,9562,755,");
strBuf_3.append("91;-1,2,-94,-117,-1,2,-94,-111,0,2642,-1,-1,-1;-1,2,-94,-109");
strBuf_3.append(",0,2641,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-1");
strBuf_3.append("03,-1,2,-94,-112,https://www.officedepot.com/-1,2,-94,-115,1");
strBuf_3.append("31209,102135,32,2642,2641,0,238594,9579,0,1656951343231,14,1");
strBuf_3.append("7725,21,14,2954,4,0,9581,220927,0,6477B517AA19C8A6D24FA64BF8");
strBuf_3.append("7FBEC1~-1~YAAQb4PXF9L+DbeBAQAAhSv/yQg9fovVrf+tYIZLPfLiiioojJ");
strBuf_3.append("aGpdo1jTUMr3UKFhuYvPFTvlv2AayxdhPAYXlN/eV3KthD+GF/eYbClmHiWU");
strBuf_3.append("BA0SdP2B8FOS8k6ow/94wZEW0xHl8IqUwmtbDzh9qyVlDAW/nLx/bhIXiL1y");
strBuf_3.append("CexZA+7MOIZSyyRADZVEweByFjhdXz4A3RRU9tvoMug58wB+3sEq1XESY7in");
strBuf_3.append("vtRRLiYcZYcoy8eDrN+E1WPFcICBsq2BFtma1ts/9Qu9D+LXtOR0LHMRsb3y");
strBuf_3.append("vYvDwHFiBk0n1awvE6ShuHMIg74Zwy/tJznpn1xtjgPmXr9mxT3D2+nYy3e6");
strBuf_3.append("1oZuU32Loo96sage02lgpzHv7pKWsRUSXM0sPgk+BD/ASVYf4JjKTf~-1~||");
strBuf_3.append("1-ugvpNbGKzL-1-10-1000-2||~-1,39587,121,-360798511,30261693,");
strBuf_3.append("PiZtE,60600,38,14,true-1,2,-94,-106,8,4-1,2,-94,-119,-1-1,2,");
strBuf_3.append("-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,0.534b0d0d");
strBuf_3.append("6012e,0.ffbc7b45c65ec,0.4ebd78857d635,0.d5c73138dfee3,0.7c3b");
strBuf_3.append("69728e10c,0.cf056d9c94b1f,0.4c6d8ad444749,0.cd95b966be67f,0.");
strBuf_3.append("86e365807953a,0.47a54d3803b88;1,0,1,1,6,3,2,2,5,6;0,0,1,1,8,");
strBuf_3.append("7,5,5,9,21;6477B517AA19C8A6D24FA64BF87FBEC1,1656951343231,ug");
strBuf_3.append("vpNbGKzL,6477B517AA19C8A6D24FA64BF87FBEC11656951343231ugvpNb");
strBuf_3.append("GKzL,1,1,0.534b0d0d6012e,6477B517AA19C8A6D24FA64BF87FBEC1165");
strBuf_3.append("6951343231ugvpNbGKzL10.534b0d0d6012e,191,118,56,199,149,186,");
strBuf_3.append("134,0,101,253,82,24,194,244,9,201,17,236,169,95,54,90,97,6,2");
strBuf_3.append("15,0,134,68,248,98,127,35,2093,0,1656951352810;-1,2,-94,-126");
strBuf_3.append(",-1,2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;-8");
strBuf_3.append("51345892;dis;,7;true;true;true;-60;true;24;24;true;false;-1-");
strBuf_3.append("1,2,-94,-80,5372-1,2,-94,-116,20148270-1,2,-94,-118,187827-1");
strBuf_3.append(",2,-94,-129,479507b7234c45186c995a034296add61e679bb70e959949");
strBuf_3.append("97a64c22e9b0d79c,1.5,769baa1e58c97f68e09ccec638eeebbd0063964");
strBuf_3.append("4b5049f8a3ec95a8672a5b0cb,Google Inc. (Intel),ANGLE (Intel, ");
strBuf_3.append("Intel(R) UHD Graphics 630 Direct3D11 vs_5_0 ps_5_0, D3D11),9");
strBuf_3.append("5f5b71fe531f867faa814bdd4050dd8057206d53ecec1163523560525884");
strBuf_3.append("870,33-1,2,-94,-121,;4;16;0\"}");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1ECFBB4C3F39BD0E519B06161363232", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F3E9B0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Thu, 01 Jan 1970 00:00:00 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/akam-sw.js", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F3E9B3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F45EEEE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F45EF1E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F4AD52E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F4D410E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F52241E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F52244E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F57050E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F57053E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F5BE70E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F5BE73E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F60C9EE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F60CA1E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F65AF7E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F65AFAE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F6A923E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F6A926E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F71E02E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F71E05E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F76C20E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F76C23E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F79391E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F79394E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F80883E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F80886E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F85683E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F85686E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F8A4A0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F8A4A3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F8CC09E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F8CC0CE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C3F919E5E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C3F919E8E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C41DDFE0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C41DDFE3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C41E2E44E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C41E2E47E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C41EA330E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C41EA333E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C41EF19BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C41EF19EE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C41F6683E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C41F6686E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C41FB4EBE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C41FB4EEE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C420C657E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C420C65AE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C4216250E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=1&tt=0&rl=1&obo=1&ld=8v7&r=6270a3ca7376c496c8631362d76c9d41&ul=8v9&hd=9w3\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951354.51", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C4216253E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C421B074E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2536", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951356.49;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\"", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C421B077E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_4.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_4.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_4.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_4.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_4.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.50328913");
strBuf_4.append("7251,828475678817.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_4.append("dm_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;");
strBuf_4.append("0,0,0,0,-1,310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0");
strBuf_4.append(",2,0,0,1240,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0");
strBuf_4.append(",2,0,0,1243,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0");
strBuf_4.append(",2,0,0,1246,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0");
strBuf_4.append(",2,0,0,1249,2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0");
strBuf_4.append(",2,0,0,1291,2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0");
strBuf_4.append(",2,0,0,1294,2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0");
strBuf_4.append(",2,0,0,1297,2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0");
strBuf_4.append(",2,0,0,1291,2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,0,0,0");
strBuf_4.append(",-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,0,1057,");
strBuf_4.append("1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0,0,1241");
strBuf_4.append(",2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0,0,1244");
strBuf_4.append(",2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0,0,1247");
strBuf_4.append(",2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0,0,1289");
strBuf_4.append(",2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1292");
strBuf_4.append(",2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,0,1295");
strBuf_4.append(",2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,0,1298");
strBuf_4.append(",2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1293");
strBuf_4.append(",2059,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94,-117,-1,2,-94,-");
strBuf_4.append("111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,");
strBuf_4.append("https://www.officedepot.com/catalog/search.do?Ntt=stapler-1,");
strBuf_4.append("2,-94,-115,1,32,32,0,0,0,0,3,0,1656951357635,-999999,17725,0");
strBuf_4.append(",0,2954,0,0,6,0,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4");
strBuf_4.append("PXFw7/DbeBAQAAAjP/yQjjejtUy2eMCwSfwuJiAoH4pUFatjtL5DuX8+aoDT");
strBuf_4.append("WLmTdk4QnZhtaU+Vs+eNocvPL6CrtxDSzzl03M9GExMou+slQPey8KtByndf");
strBuf_4.append("g27nptRUUUzP9rjlPzU9f/HiFog/7QrXJRGa+BEpwY5DBEnnofahnyWCdG+s");
strBuf_4.append("ESFY2P/ovU3PrLbcSjpysIheeTerEkkXNQzd8UtAhs+NW4h6lRofDjfSb47S");
strBuf_4.append("Ahiqfp3b7ENAmLY6Wsjf8uuEXyqghC8YxvYS8BzuQDO6MHtCdiSNr0HTgvTj");
strBuf_4.append("sF2wR9MoWDLVcRwWKLgoy0FVtvqD4RRFbEHtnjDscBXA8FGXrkQ5MYu+1IS8");
strBuf_4.append("eMhlghLatzqFL2FR4iulC+VSU7NJ4RQmOoIMbP~-1~-1~-1,38158,-1,-1,");
strBuf_4.append("30261693,PiZtE,34615,35,14,true-1,2,-94,-106,0,0-1,2,-94,-11");
strBuf_4.append("9,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-");
strBuf_4.append("1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-70,-1-1,2,-94,-80,94-1");
strBuf_4.append(",2,-94,-116,4072848-1,2,-94,-118,142059-1,2,-94,-129,-1,2,-9");
strBuf_4.append("4,-121,;5;-1;0\"}");
String requestData_4 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1ECFBB4C421D780E519B06161363232", postData, requestData_4, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C421FE90E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951356.49;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C421FE93E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C45A4CA0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "527", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C45A4CA3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_5(HTTPPostData postData) {
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("id=7d9f2add-a0a5-4bfb-9ca9-9401e1d819e7&tagId=11024&fullRefe");
strBuf_5.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fcatalog%2Fsearch");
strBuf_5.append(".do%3FNtt%3Dstapler&payload=%7B%22sitePage%22%3A%7B%22enterp");
strBuf_5.append("riseId%22%3A%221523082%22%2C%22cartSubtotal%22%3A%220%22%2C%");
strBuf_5.append("22trackingSource%22%3A%22gtm%22%2C%22pageType%22%3A%22N%2FA%");
strBuf_5.append("22%2C%22%22%3A%7B%22userId%22%3A%22%22%2C%22emailHash%22%3A%");
strBuf_5.append("22%22%2C%22marketing_channel%22%3A%22In%20Progress%22%7D%7D%");
strBuf_5.append("7D&isDeviceAccessGranted=false&cjUser=00000000-0000-0000-000");
strBuf_5.append("0-000000000000&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_5 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1ECFBB4C45A4CFCE519B06161363232", postData, requestData_5, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C45A7411E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C45A7414E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C45AC1D0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2881", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_pin_unauth=dWlkPU5qQm1PV1psTlRZdE1tVmxNUzAwT1RFekxXRTJPRGt0TWpKalpXWmhaamMxT1RVMA;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951356.49;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C421B074E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C45AC1D3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_6(HTTPPostData postData) {
				StringBuffer strBuf_6 = new StringBuffer();
strBuf_6.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_6.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_6.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_6.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_6.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_6.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.31376637");
strBuf_6.append("8156,828475678817.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_6.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_6.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_6.append("-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_6.append(",310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,124");
strBuf_6.append("0,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,124");
strBuf_6.append("3,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,124");
strBuf_6.append("6,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,124");
strBuf_6.append("9,2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_6.append("1,2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,129");
strBuf_6.append("4,2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,129");
strBuf_6.append("7,2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_6.append("1,2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,0,0,0,-1,310,1;");
strBuf_6.append("0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,0,1057,1057,0;0,-");
strBuf_6.append("1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0,0,1241,2007,0;0,");
strBuf_6.append("2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0,0,1244,2010,0;0,");
strBuf_6.append("2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0,0,1247,2013,0;0,");
strBuf_6.append("2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0,0,1289,2055,0;0,");
strBuf_6.append("2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1292,2058,0;0,");
strBuf_6.append("2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,0,1295,2061,0;0,");
strBuf_6.append("2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,0,1298,2064,0;0,");
strBuf_6.append("2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1293,2059,0;-1");
strBuf_6.append(",2,-94,-108,-1,2,-94,-110,0,1,944,699,214;1,1,952,698,222;2,");
strBuf_6.append("1,974,698,231;3,1,999,697,243;-1,2,-94,-117,-1,2,-94,-111,0,");
strBuf_6.append("1002,-1,-1,-1;-1,2,-94,-109,0,1002,-1,-1,-1,-1,-1,-1,-1,-1,-");
strBuf_6.append("1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://www.offi");
strBuf_6.append("cedepot.com/catalog/search.do?Ntt=stapler-1,2,-94,-115,1,761");
strBuf_6.append("3,32,1002,1002,0,9585,1022,0,1656951357635,19,17725,0,4,2954");
strBuf_6.append(",0,0,1026,5873,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4P");
strBuf_6.append("XF6r/DbeBAQAAsUH/yQjGR0I75IC8Ilb37UvS29n+MLk5aNT+EJewMfLhMXD");
strBuf_6.append("9sCeUhTobIY8IDhl9Ggg/2O8D5pfCac1iVMgfV7BdCNZWng/QV4KsAcAhevP");
strBuf_6.append("7iMe1UOgQYyy4JAKsZQ1/Rk24JSXbrvPMezY7FrEQiuLcqTtn/3Z8s6WUWpo");
strBuf_6.append("rAVRfb1dHwTwoVAwmiRUUVPrEWnS+E+O3skTwI3yT/BA51veaQkbvgBH8Gah");
strBuf_6.append("HUeFzABjgkGH2WJAG9McJy8LQP9Moow1EHQlzo8wakTyHwb/XY6LTr1Cveji");
strBuf_6.append("LDd3KzL+um1rdk8OVITr7RGfPJ6iq/LuqTDK/xHcOZjTcNHMkUcketW01qp6");
strBuf_6.append("HGBr59Xp998eWkxVvd5fc7T9LcZsVoAUxycI3~-1~-1~-1,36901,143,688");
strBuf_6.append("859606,30261693,PiZtE,42316,67,14,true-1,2,-94,-106,9,1-1,2,");
strBuf_6.append("-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94");
strBuf_6.append(",-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322243122-1,2,-");
strBuf_6.append("94,-70,273720021;-851345892;dis;,7;true;true;true;-60;true;2");
strBuf_6.append("4;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116,4072848-1,2");
strBuf_6.append(",-94,-118,156521-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;7;11;0\"");
strBuf_6.append("}");
String requestData_6 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1ECFBB4C45AE8E0E519B06161363232", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C45AE93BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;BVBRANDID=97e5a16e-1157-48bf-b17d-d0e68343c38f;BVBRANDSID=565136c2-f4bb-4164-9742-acaba5a1df07;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951356.49;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C45AC1D0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C45AE93EE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C45B5E19E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3076", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951359.46;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C45AC1D0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C3F1C6E2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C45B5E1CE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_7.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_7.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_7.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_7.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_7.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.77592804");
strBuf_7.append("0387,828475678817.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_7.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_7.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_7.append("-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_7.append(",310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,124");
strBuf_7.append("0,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,124");
strBuf_7.append("3,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,124");
strBuf_7.append("6,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,124");
strBuf_7.append("9,2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_7.append("1,2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,129");
strBuf_7.append("4,2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,129");
strBuf_7.append("7,2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_7.append("1,2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,-1,0,0,-1,-1,0;");
strBuf_7.append("0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,");
strBuf_7.append("0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0");
strBuf_7.append(",0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0");
strBuf_7.append(",0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0");
strBuf_7.append(",0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0");
strBuf_7.append(",0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0");
strBuf_7.append(",0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0");
strBuf_7.append(",0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0");
strBuf_7.append(",0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0");
strBuf_7.append(",0,1293,2059,0;-1,2,-94,-108,-1,2,-94,-110,0,1,944,699,214;1");
strBuf_7.append(",1,952,698,222;2,1,974,698,231;3,1,999,697,243;4,1,2232,570,");
strBuf_7.append("757;5,1,3638,1052,433;6,1,3910,1054,414;7,1,3954,1054,413;8,");
strBuf_7.append("1,4297,1054,411;9,3,4416,1054,411,-1;-1,2,-94,-117,-1,2,-94,");
strBuf_7.append("-111,0,1002,-1,-1,-1;-1,2,-94,-109,0,1002,-1,-1,-1,-1,-1,-1,");
strBuf_7.append("-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://w");
strBuf_7.append("ww.officedepot.com/catalog/search.do?Ntt=stapler-1,2,-94,-11");
strBuf_7.append("5,1,38784,32,1002,1002,0,40756,4416,0,1656951357635,19,17725");
strBuf_7.append(",0,10,2954,1,0,4418,28320,0,6477B517AA19C8A6D24FA64BF87FBEC1");
strBuf_7.append("~-1~YAAQb4PXF83/DbeBAQAAckX/yQhKDw68/PauogqblvsE9cpNSbbsL5hq");
strBuf_7.append("X5/8Gxl7619Fl5VzuAyFXbk3Tkq6njRN9x8jSwHQzPWsHtUwGpZ/Wq+vqfFo");
strBuf_7.append("Cn8LTwYJ9z+8FxUqgJ+7NSFzQiBHBkvHE86dXQNQZGwPs9s42IVe5LxPFt/q");
strBuf_7.append("xocnD2qwV3u+pg+43m4r1edZ0Fftyq0u4QA0l7dF1/WPprpM8WX7cSUFC2Ip");
strBuf_7.append("utlTJuf99fBDfZ22XRpfZGBHNTIlZGekZJwHSpcCLlCUN5tvTUbBD++WfCeN");
strBuf_7.append("CdvSL6ZD5DspAIdjJayhuCMNAmUJmZEcz2PgZF25YlyYVjtn0JAATpSPcA8X");
strBuf_7.append("evPOrvcvlZoanA8K+iaTPwl3VtyLK4cd8+5T/Cb6WEiIl4rs~-1~-1~-1,37");
strBuf_7.append("191,143,688859606,30261693,PiZtE,106922,65,14,true-1,2,-94,-");
strBuf_7.append("106,1,2-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-");
strBuf_7.append("123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322");
strBuf_7.append("243122-1,2,-94,-70,273720021;-851345892;dis;,7;true;true;tru");
strBuf_7.append("e;-60;true;24;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116");
strBuf_7.append(",4072848-1,2,-94,-118,163374-1,2,-94,-129,,,769baa1e58c97f68");
strBuf_7.append("e09ccec638eeebbd00639644b5049f8a3ec95a8672a5b0cb,,,,0-1,2,-9");
strBuf_7.append("4,-121,;3;11;0\"}");
String requestData_7 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1ECFBB4C45B8571E519B06161363232", postData, requestData_7, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(1705, 1, parent, parent, "A1ECFBB4C62548A9E519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Stapler Results", "A1ECFBB4C62548A9E519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_41(this, true, "A1ECFBB4C62548A1E519B06161363232", true, false,
						"Config_3", "/en_US_od_business_accelerator_search.xml",	"/en_US_od_business_accelerator_search.xml", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_42(this, false, "A1ECFBB4C62596C1E519B06161363232", false, false,
						"Config_4", "/favicon.ico?v=1.1",	"/favicon.ico?v=1.1", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_43(this, false, "A1ECFBB4C625E4E3E519B06161363232", true, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 60, 100, "A1ECFBB4C62548ADE519B06161363232", 3);
				httpParallel.addRequest(1, request_44(this, false, "A1ECFBB4C62596C1E519B06161363232", true, false,
						"Config_4", "/en_US_od_business_accelerator_search.xml",	"/en_US_od_business_accelerator_search.xml", true, false), 54, 100, "A1ECFBB4C62596CFE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C62548ADE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(5);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C62548B0E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(301);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C62596CFE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951359.46;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_gali=monetate_allinone_lightbox;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C62596D2E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C625E4F1E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3798", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=1&tt=0&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951359.46;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_gali=monetate_allinone_lightbox;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C625E4F4E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_8 = new StringBuffer();
strBuf_8.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_8.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_8.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_8.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_8.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_8.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.12856477");
strBuf_8.append("264,828475678817.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_8.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_8.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_8.append("1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,");
strBuf_8.append("310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240");
strBuf_8.append(",2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243");
strBuf_8.append(",2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246");
strBuf_8.append(",2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249");
strBuf_8.append(",2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291");
strBuf_8.append(",2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294");
strBuf_8.append(",2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297");
strBuf_8.append(",2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291");
strBuf_8.append(",2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,-1,0,0,-1,-1,0;0");
strBuf_8.append(",0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,0");
strBuf_8.append(",1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0,");
strBuf_8.append("0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0,");
strBuf_8.append("0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0,");
strBuf_8.append("0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0,");
strBuf_8.append("0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,");
strBuf_8.append("0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,");
strBuf_8.append("0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,");
strBuf_8.append("0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,");
strBuf_8.append("0,1293,2059,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_8.append("0,-1,622,0;-1,-1,1,0,-1,706,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-");
strBuf_8.append("1,219,0;-1,-1,1,0,-1,220,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,2");
strBuf_8.append("16,0;-1,-1,1,0,-1,118,0;-1,-1,1,0,-1,214,0;-1,-1,1,0,-1,427,");
strBuf_8.append("0;-1,-1,1,0,-1,418,0;-1,-1,1,0,-1,421,0;-1,-1,1,0,-1,511,0;-");
strBuf_8.append("1,-1,1,0,-1,632,0;-1,-1,1,0,-1,424,0;-1,-1,1,0,-1,434,0;-1,-");
strBuf_8.append("1,1,0,-1,360,0;-1,-1,1,0,-1,629,0;-1,-1,1,0,-1,622,0;-1,2,-9");
strBuf_8.append("4,-108,-1,2,-94,-110,0,1,944,699,214;1,1,952,698,222;2,1,974");
strBuf_8.append(",698,231;3,1,999,697,243;4,1,2232,570,757;5,1,3638,1052,433;");
strBuf_8.append("6,1,3910,1054,414;7,1,3954,1054,413;8,1,4297,1054,411;9,3,44");
strBuf_8.append("16,1054,411,-1;10,4,4650,1054,411,-1;11,2,5461,1054,411,-1;1");
strBuf_8.append("2,1,5492,364,758;13,1,6533,363,757;14,3,7384,363,757,-1;-1,2");
strBuf_8.append(",-94,-117,-1,2,-94,-111,0,1002,-1,-1,-1;-1,2,-94,-109,0,1002");
strBuf_8.append(",-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2");
strBuf_8.append(",-94,-112,https://www.officedepot.com/catalog/search.do?Ntt=");
strBuf_8.append("stapler-1,2,-94,-115,1,74667,32,1002,1002,0,76639,7384,0,165");
strBuf_8.append("6951357635,19,17725,0,15,2954,3,0,7394,57840,0,6477B517AA19C");
strBuf_8.append("8A6D24FA64BF87FBEC1~-1~YAAQb4PXF3MADreBAQAATlP/yQjG1ZMjexmtP");
strBuf_8.append("aMwjUaN30hllL7ygCtic/SOZvS+trtgnDUHS/U8gpJYXo8nu2sZNPb9QnJvp");
strBuf_8.append("lVk/xNCOIrDcYKpHcvxgDKAxA/27oLLcEm1Yg7SCxDxCVhSLpAtFYcBsFTGd");
strBuf_8.append("Z6c9W7YegCwuaMxk9vFO1vtfK/4L1yhm7nY3q96Mz1lDV1g9rJfdOCDNhpR8");
strBuf_8.append("MHwMo9lYLc24wBfLUq4IJRWE5PXegALZcpAji2L+ZcMJr7KUkix7Oa3uJEl/");
strBuf_8.append("E4ySjylvmO663wBcKQyvEnhDfYW8rDp9qz5tiOoBZz1qbMWS85guxb0YXpN+");
strBuf_8.append("Xc6rCfp3vZaBI6VQ28+1q0kKzkcth3ztizb74LFx/SnKugt5TRR8+dlIOorX");
strBuf_8.append("uWkobWF~-1~-1~-1,37659,143,688859606,30261693,PiZtE,86494,58");
strBuf_8.append(",14,true-1,2,-94,-106,1,3-1,2,-94,-119,-1-1,2,-94,-122,0,0,1");
strBuf_8.append(",0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-");
strBuf_8.append("127,21321144241322243122-1,2,-94,-70,273720021;-851345892;di");
strBuf_8.append("s;,7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80");
strBuf_8.append(",5372-1,2,-94,-116,4072848-1,2,-94,-118,187871-1,2,-94,-129,");
strBuf_8.append("479507b7234c45186c995a034296add61e679bb70e95994997a64c22e9b0");
strBuf_8.append("d79c,1.5,769baa1e58c97f68e09ccec638eeebbd00639644b5049f8a3ec");
strBuf_8.append("95a8672a5b0cb,Google Inc. (Intel),ANGLE (Intel, Intel(R) UHD");
strBuf_8.append(" Graphics 630 Direct3D11 vs_5_0 ps_5_0, D3D11),95f5b71fe531f");
strBuf_8.append("867faa814bdd4050dd8057206d53ecec1163523560525884870,33-1,2,-");
strBuf_8.append("94,-121,;12;11;0\"}");
String requestData_8 = strBuf_8.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1ECFBB4C6260C04E519B06161363232", postData, requestData_8, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C6263356E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C62548ADE519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"utf-8",
			"A1ECFBB4C6263359E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(1125, 1, parent, parent, "A1ECFBB4C8270C1FE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Bostitch Stapler", "A1ECFBB4C8270C1FE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(9, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_45(this, true, "A1ECFBB4C8270C11E519B06161363232", true, true,
						"Config_4", "/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/",	"/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_46(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/styles/od/skupage_override.min.f590116861.css",	"/styles/od/skupage_override.min.f590116861.css", true, false), 768, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_47(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/styles/sku_page.min.8e07d499ef3a3aa156dc.css",	"/styles/sku_page.min.8e07d499ef3a3aa156dc.css", true, false), 773, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(3, request_48(this, false, "A1ECFBB4C85288E0E519B06161363232", true, false,
						"Config_4", "/js/global_resources.min.af094a968357d28d3e0b.js",	"/js/global_resources.min.af094a968357d28d3e0b.js", true, false), 769, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(4, request_49(this, false, "A1ECFBB4C8537342E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 770, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(5, request_50(this, false, "A1ECFBB4C853C1A5E519B06161363232", true, false,
						"Config_4", "/js/conversant.min.053f8dfab1eb9d5f68a8.js",	"/js/conversant.min.053f8dfab1eb9d5f68a8.js", true, false), 770, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(1, request_51(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/js/global_recently_viewed.min.7c8fe75a73271abbe4e8.js",	"/js/global_recently_viewed.min.7c8fe75a73271abbe4e8.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_52(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/js/rich_relevance.min.033455e584a16ab6476c.js",	"/js/rich_relevance.min.033455e584a16ab6476c.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_53(this, false, "A1ECFBB4C8537342E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=6&cachebuster=1048859727",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=6&cachebuster=1048859727", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_54(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 1751, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_55(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 2274, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_56(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703",	"/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703", true, false), 3491, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(4, request_57(this, false, "A1ECFBB4C8537342E519B06161363232", true, false,
						"Config_4", "/json/translations.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?keys=atc.warranty.lightbox.heading,atc.warranty.lightbox.sub.heading,atc.warranty.lightbox.customer.benefits,atc.warranty.lightbox.customer.shipping,atc.warranty.lightbox.customer.support,atc.warranty.lightbox.smartphone.protection,atc.warranty.lightbox.customer.smart.device.service,atc.warranty.lightbox.customer.nohidden.fees,atc.warranty.lightbox.btn1,atc.warranty.lightbox.continueshooping,atc.warranty.lightbox.addtocart,atc.common.continue.to.cart,atc.warranty.continue.cart,atc.warranty.lightbox.add.protection.plan,atc.warranty.lightbox.laptop.subheading,atc.warranty.lightbox.laptop.subheading.protection,atc.warranty.lightbox.smarttv.gear.heading,atc.warranty.covers.mechanical.electrical.failures,atc.warranty.lightbox.covers.wifi.failures,atc.warranty.lightbox.gear.support,atc.warranty.lightbox.ipad.support,atc.warranty.lightbox.ipad.support.touchscreen,atc.warranty.lightbox.furniture.main.heading,atc.warranty.lightbox.gouges,atc.warranty.lightbox.furniture.hardware.failures,intro",	"/json/translations.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?keys=atc.warranty.lightbox.heading,atc.warranty.lightbox.sub.heading,atc.warranty.lightbox.customer.benefits,atc.warranty.lightbox.customer.shipping,atc.warranty.lightbox.customer.support,atc.warranty.lightbox.smartphone.protection,atc.warranty.lightbox.customer.smart.device.service,atc.warranty.lightbox.customer.nohidden.fees,atc.warranty.lightbox.btn1,atc.warranty.lightbox.continueshooping,atc.warranty.lightbox.addtocart,atc.common.continue.to.cart,atc.warranty.continue.cart,atc.warranty.lightbox.add.protection.plan,atc.warranty.lightbox.laptop.subheading,atc.warranty.lightbox.laptop.subheading.protection,atc.warranty.lightbox.smarttv.gear.heading,atc.warranty.covers.mechanical.electrical.failures,atc.warranty.lightbox.covers.wifi.failures,atc.warranty.lightbox.gear.support,atc.warranty.lightbox.ipad.support,atc.warranty.lightbox.ipad.support.touchscreen,atc.warranty.lightbox.furniture.main.heading,atc.warranty.lightbox.gouges,atc.warranty.lightbox.furniture.hardware.failures,intro", true, false), 3493, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(6, request_58(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", true, false,
						"Config_4", "/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 3498, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(1, request_59(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/mobile/getSkuAvailableOptions.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?familyDescription=Bostitch%20%20InPower&trade;%20Premium%20Spring-Powered%20Desktop%20Stapler&sku=551703",	"/mobile/getSkuAvailableOptions.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?familyDescription=Bostitch%20%20InPower&trade;%20Premium%20Spring-Powered%20Desktop%20Stapler&sku=551703", true, false), 3509, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_60(this, false, "A1ECFBB4C8289303E519B06161363232", true, false,
						"Config_4", "/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703",	"/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_61(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 4247, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(7, request_62(this, false, "A1ECFBB4C857B907E519B06161363232", false, false,
						"Config_5", "/services/store-locator-service/stores/v1/91",	"/services/store-locator-service/stores/v1/91", true, false), 1105, 100, "A1ECFBB4C855E49CE519B06161363232", 3);
				httpParallel.addRequest(7, request_63(this, false, "A1ECFBB4C857B907E519B06161363232", true, false,
						"Config_5", "/services/store-locator-service/stores/v1/91",	"/services/store-locator-service/stores/v1/91", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_64(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703,203349,432255&mapBySkuId=true&showRestricted=true&noSession=true&pr=",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703,203349,432255&mapBySkuId=true&showRestricted=true&noSession=true&pr=", true, false), 5231, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(1, request_65(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=923328,475166,758877&mapBySkuId=true&showRestricted=true&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=923328,475166,758877&mapBySkuId=true&showRestricted=true&noSession=true", true, false), 5700, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(8, request_66(this, false, "A1ECFBB4C8587CAEE519B06161363232", false, false,
						"Config_5", "/services/cross-sell-service/csModel",	"/services/cross-sell-service/csModel", true, false), 351, 100, "A1ECFBB4C857E010E519B06161363232", 3);
				httpParallel.addRequest(1, request_67(this, false, "A1ECFBB4C8286BA0E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 6126, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(8, request_68(this, false, "A1ECFBB4C8587CAEE519B06161363232", true, false,
						"Config_5", "/services/cross-sell-service/csModel",	"/services/cross-sell-service/csModel", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8270C23E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/catalog/search.do?Ntt=stapler", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951359.46;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6\";_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8270C26E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8286BAEE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6&hd=l3e\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8286BB1E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8289311E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6&hd=l3e\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8289314E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C85288EEE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6&hd=l3e\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C85288F1E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8537350E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6&hd=l3e\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8537353E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C853C1B3E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6&hd=l3e\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C853C1B6E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8540FD3E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=e37g29y7n3p&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1&nu=a3a0f4088bb8fa16b456ad06a252a9d3&cl=jbm&ld=jg4&r=4aa6486cd78aeb7de7c186794cb25a4b&ul=jg6&hd=l3e\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8540FD6E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8545DF3E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8545DF6E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8556F13E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.mbsh=%7B%221656951356213%22%3A%7B%7D%7D;_ga=GA1.2.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951368.37;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8556F16E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C855BD47E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "566", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-1e61aec265fa5b45----1656951369886", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-268de89f52e9e2babe179981293e4ae0-1e61aec265fa5b45-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMWU2MWFlYzI2NWZhNWI0NSIsInRyIjoiMjY4ZGU4OWY1MmU5ZTJiYWJlMTc5OTgxMjkzZTRhZTAiLCJ0aSI6MTY1Njk1MTM2OTg4NiwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("content-type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_9(postData);
				
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C855BD4AE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_9 = new StringBuffer();
strBuf_9.append("id=82c02072-5a91-423f-a420-106a4b11b197&tagId=11024&fullRefe");
strBuf_9.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fa%2Fproducts%2F5");
strBuf_9.append("51703%2FBostitch-InPower-Premium-Spring-Powered-Desktop%2F&p");
strBuf_9.append("ayload=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%22152308");
strBuf_9.append("2%22%2C%22cartSubtotal%22%3A%220%22%2C%22trackingSource%22%3");
strBuf_9.append("A%22gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22%22%3A%7B%22u");
strBuf_9.append("serId%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C%22marketing_");
strBuf_9.append("channel%22%3A%22In%20Progress%22%7D%7D%7D&isDeviceAccessGran");
strBuf_9.append("ted=false&cjUser=00000000-0000-0000-0000-000000000000&cookie");
strBuf_9.append("s=cjConsent%3DMHxZfDB8Tnww");
String requestData_9 = strBuf_9.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1ECFBB4C855E440E519B06161363232", postData, requestData_9, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_8);

	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C855E49CE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1644", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-22f223ad625121e4----1656951370409", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-8f76b2a679c4637c0f4239557b6b0320-22f223ad625121e4-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMjJmMjIzYWQ2MjUxMjFlNCIsInRyIjoiOGY3NmIyYTY3OWM0NjM3YzBmNDIzOTU1N2I2YjAzMjAiLCJ0aSI6MTY1Njk1MTM3MDQwOSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951369.36;_ga=GA1.1.793288138.1656951346;mt.mbsh=%7B%221656951370309%22%3A%7B%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_10(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C855E49FE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_10(HTTPPostData postData) {
				StringBuffer strBuf_10 = new StringBuffer();
strBuf_10.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_10.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_10.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_10.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1370395,2560,1401,25");
strBuf_10.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_10.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.00976076");
strBuf_10.append("94,828475685197.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,dm");
strBuf_10.append("_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,");
strBuf_10.append("0,0,0,-1,310,0;0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-9");
strBuf_10.append("4,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,0;");
strBuf_10.append("0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-94,-108,-1,2,-94");
strBuf_10.append(",-110,-1,2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-11");
strBuf_10.append("4,-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/a/");
strBuf_10.append("products/551703/Bostitch-InPower-Premium-Spring-Powered-Desk");
strBuf_10.append("top/-1,2,-94,-115,1,32,32,0,0,0,0,2,0,1656951370395,-999999,");
strBuf_10.append("17725,0,0,2954,0,0,4,0,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1");
strBuf_10.append("~YAAQb4PXF9sADreBAQAAxl7/yQgZKyc+tF1uk9mvUs4rmJWGItjrTsHY0yj");
strBuf_10.append("ldRyPOZXItvjmTiv40GqARaxNfS7ji/D2BbN7esn5ud6sUNNEt4BGW1pM3gG");
strBuf_10.append("0+KSHIpB0ucJxL1oXgzvVm3mntf8Efz5wZ1sTIS5IcNluHNi1ix6Ylo80u6y");
strBuf_10.append("qe9/AFj4mFsCW475rk+EozhqSKc9sNLKBFvT01cr0tprnan4rZl5UHb+yhAS");
strBuf_10.append("QiHG2wyOLrCWsQtFhk0Q7F1DDUBM4Jey0tDoECqaLfKEoNrG14ud2sDajZyj");
strBuf_10.append("OePxbq6nmopkBmO0aniALulKAx1tsxRUW9/aBLSTdxQPVZRGP5RSYIe0mKUj");
strBuf_10.append("YoFEfIR2s4EPykfQSwP4PgULU4XodmlNxJkjTMg3JVZsk~-1~-1~-1,37842");
strBuf_10.append(",-1,-1,30261693,PiZtE,21081,107,14,true-1,2,-94,-106,0,0-1,2");
strBuf_10.append(",-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-9");
strBuf_10.append("4,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-70,-1-1,2,-94,");
strBuf_10.append("-80,94-1,2,-94,-116,4111197-1,2,-94,-118,99703-1,2,-94,-129,");
strBuf_10.append("-1,2,-94,-121,;10;-1;0\"}");
String requestData_10 = strBuf_10.toString();
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1ECFBB4C8560BADE519B06161363232", postData, requestData_10, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_9);

	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C85632B3E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-1509387bab0cda73----1656951371626", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-48f40223c3d5072fd6b91f7c9bbb37c0-1509387bab0cda73-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMTUwOTM4N2JhYjBjZGE3MyIsInRyIjoiNDhmNDAyMjNjM2Q1MDcyZmQ2YjkxZjdjOWJiYjM3YzAiLCJ0aSI6MTY1Njk1MTM3MTYyNiwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951369.36;_ga=GA1.1.793288138.1656951346;mt.mbsh=%7B%221656951370309%22%3A%7B%7D%7D;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C855E49CE519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C85632B6E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8568080E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-e29e575ab1923d24----1656951371628", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-ae906b424c12b9ddc01a6f33e0f560d0-e29e575ab1923d24-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiZTI5ZTU3NWFiMTkyM2QyNCIsInRyIjoiYWU5MDZiNDI0YzEyYjlkZGMwMWE2ZjMzZTBmNTYwZDAiLCJ0aSI6MTY1Njk1MTM3MTYyOCwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951369.36;_ga=GA1.1.793288138.1656951346;mt.mbsh=%7B%221656951370309%22%3A%7B%7D%7D;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C855E49CE519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C8568083E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C856A7F2E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-f2324afba7ba91d8----1656951371633", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-daf4ce2c7475b79ad8da32c32807d080-f2324afba7ba91d8-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiZjIzMjRhZmJhN2JhOTFkOCIsInRyIjoiZGFmNGNlMmM3NDc1Yjc5YWQ4ZGEzMmMzMjgwN2QwODAiLCJ0aSI6MTY1Njk1MTM3MTYzMywidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("content-type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C856A7F5E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C856CF15E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-5da6b999d2d356a9----1656951371644", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-f07c65e646c4bf9c638b19835c7bac10-5da6b999d2d356a9-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiNWRhNmI5OTlkMmQzNTZhOSIsInRyIjoiZjA3YzY1ZTY0NmM0YmY5YzYzOGIxOTgzNWM3YmFjMTAiLCJ0aSI6MTY1Njk1MTM3MTY0NCwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951369.36;_ga=GA1.1.793288138.1656951346;mt.mbsh=%7B%221656951370309%22%3A%7B%7D%7D;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856A7F2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C855E49CE519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C856CF18E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8571CC0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-139ca10934725f92----1656951371809", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-90091ab2e5f56795516ea76b9ebd6c00-139ca10934725f92-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMTM5Y2ExMDkzNDcyNWY5MiIsInRyIjoiOTAwOTFhYjJlNWY1Njc5NTUxNmVhNzZiOWViZDZjMDAiLCJ0aSI6MTY1Njk1MTM3MTgwOSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951369.36;_ga=GA1.1.793288138.1656951346;mt.mbsh=%7B%221656951370309%22%3A%7B%7D%7D;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856A7F2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C855E49CE519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C8571CC3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8576AE1E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1902", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-941d90a63cbcb971----1656951372381", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-43aa42a8db2352f8cef34d80be24bd90-941d90a63cbcb971-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiOTQxZDkwYTYzY2JjYjk3MSIsInRyIjoiNDNhYTQyYThkYjIzNTJmOGNlZjM0ZDgwYmUyNGJkOTAiLCJ0aSI6MTY1Njk1MTM3MjM4MSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;BVBRANDID=7f5923c4-0ffd-4a40-9f9a-2e4e31d34796;BVBRANDSID=5af476cc-bf50-4933-af3e-ff33ce53a258;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D2;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951369.36;mt.mbsh=%7B%221656951370309%22%3A%7B%7D%7D;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_11(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856CF15E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856A7F2E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8576AE4E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_11(HTTPPostData postData) {
				StringBuffer strBuf_11 = new StringBuffer();
strBuf_11.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_11.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_11.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_11.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1370395,2560,1401,25");
strBuf_11.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_11.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.68058955");
strBuf_11.append("3340,828475685197.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_11.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_11.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_11.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_11.append(",310,0;0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-94,-102,0");
strBuf_11.append(",0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,0;0,-1,0,0");
strBuf_11.append(",1036,-1,1;-1,2,-94,-108,-1,2,-94,-110,0,1,1646,404,457;1,1,");
strBuf_11.append("1757,653,418;2,1,1941,839,317;-1,2,-94,-117,-1,2,-94,-111,-1");
strBuf_11.append(",2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https:");
strBuf_11.append("//www.officedepot.com/a/products/551703/Bostitch-InPower-Pre");
strBuf_11.append("mium-Spring-Powered-Desktop/-1,2,-94,-115,1,8470,32,0,0,0,84");
strBuf_11.append("38,1980,0,1656951370395,28,17725,0,3,2954,0,0,1982,5344,0,64");
strBuf_11.append("77B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4PXF1YCDreBAQAAu3n/yQ");
strBuf_11.append("idkFlbDCEuT8zKdzFt8fLuWysq900NYtEyv+pOSgwY4MUAR59pD+h8NDlEkl");
strBuf_11.append("pBPSRG8aNfnPsWeSu0IDwo8LooskbMI3VYWL7VrLPEmIZC/Db0kk5WG39eSK");
strBuf_11.append("iBb4BvZK529SWtjpPdK2R/WoSyYX7Xsud4aW+K80SFwDnAAJMIr7VSCCzxD2");
strBuf_11.append("mg7YbDx+nOIcNacIi1NhVqhM0w/ryJ3EbaAaOcXfiogDbgFjIQoYTWqe338p");
strBuf_11.append("kGAJPn3jsyWlKuZIU/90R1ngypG/EcMrfTh1PJfbihVqkyOPmNYm7Bi1qOFS");
strBuf_11.append("i7y43Zj4RIV5OO9vAfB6stXT2T2ygdItiX6np3FbDvDeAHYgzTcEyTllrTyj");
strBuf_11.append("0sEhq7vWUtFaOXF0Hb~-1~-1~-1,37346,143,688859606,30261693,PiZ");
strBuf_11.append("tE,17097,40,14,true-1,2,-94,-106,9,1-1,2,-94,-119,-1-1,2,-94");
strBuf_11.append(",-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126");
strBuf_11.append(",-1,2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;-8");
strBuf_11.append("51345892;dis;,7;true;true;true;-60;true;24;24;true;false;-1-");
strBuf_11.append("1,2,-94,-80,5372-1,2,-94,-116,4111197-1,2,-94,-118,110779-1,");
strBuf_11.append("2,-94,-129,,,0,,,,0-1,2,-94,-121,;4;15;0\"}");
String requestData_11 = strBuf_11.toString();
			
	HTTPPostDataChunk pdc_10 = new HTTPPostDataChunk("A1ECFBB4C85791FAE519B06161363232", postData, requestData_11, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_10);

	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C857B915E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C857B918E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C857E010E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C857E013E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8580720E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-70f48086e49f51bb----1656951373365", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-8691374309bf7d7f268f910ff1e74960-70f48086e49f51bb-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiNzBmNDgwODZlNDlmNTFiYiIsInRyIjoiODY5MTM3NDMwOWJmN2Q3ZjI2OGY5MTBmZjFlNzQ5NjAiLCJ0aSI6MTY1Njk1MTM3MzM2NSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951372.33;BVBRANDID=4943a6f7-fce9-4f7f-b9d7-edf00087cd3d;BVBRANDSID=8ac0af48-0095-436b-8bb0-54f218c0797e;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856A7F2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8576AE1E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C8580723E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8585541E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-2e7ed51052ec6c0c----1656951373831", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-7ee27fa6bf114aa38fc0e66c676da9e0-2e7ed51052ec6c0c-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMmU3ZWQ1MTA1MmVjNmMwYyIsInRyIjoiN2VlMjdmYTZiZjExNGFhMzhmYzBlNjZjNjc2ZGE5ZTAiLCJ0aSI6MTY1Njk1MTM3MzgzMSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;BVBRANDID=4943a6f7-fce9-4f7f-b9d7-edf00087cd3d;BVBRANDSID=8ac0af48-0095-436b-8bb0-54f218c0797e;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951373.32", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856A7F2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8576AE1E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1ECFBB4C8585544E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8587CBCE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Access-Control-Request-Method", "POST", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Access-Control-Request-Headers", "content-type", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"OPTIONS",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C8587CBFE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C85B8990E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2191", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-3dc898d4b42779d5----1656951374262", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-a252a297ee1f15df6cdc0e92e9018e70-3dc898d4b42779d5-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiM2RjODk4ZDRiNDI3NzlkNSIsInRyIjoiYTI1MmEyOTdlZTFmMTVkZjZjZGMwZTkyZTkwMThlNzAiLCJ0aSI6MTY1Njk1MTM3NDI2MiwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;BVBRANDID=4943a6f7-fce9-4f7f-b9d7-edf00087cd3d;BVBRANDSID=8ac0af48-0095-436b-8bb0-54f218c0797e;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951373.32", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_12(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C856A7F2E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8576AE1E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C85BB0A0E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_12(HTTPPostData postData) {
				StringBuffer strBuf_12 = new StringBuffer();
strBuf_12.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_12.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_12.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_12.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1370395,2560,1401,25");
strBuf_12.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_12.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.17245196");
strBuf_12.append("886,828475685197.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_12.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_12.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_12.append("1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,");
strBuf_12.append("310,0;0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-94,-102,0,");
strBuf_12.append("0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,0;0,-1,0,0,");
strBuf_12.append("1036,-1,1;-1,2,-94,-108,-1,2,-94,-110,0,1,1646,404,457;1,1,1");
strBuf_12.append("757,653,418;2,1,1941,839,317;3,1,2057,912,277;4,1,2183,1000,");
strBuf_12.append("249;5,1,2320,1085,233;6,1,2532,1100,231;7,1,2712,1098,237;8,");
strBuf_12.append("1,2825,1094,246;9,1,2933,1093,247;10,1,3447,1080,277;11,3,38");
strBuf_12.append("63,1080,277,-1;-1,2,-94,-117,-1,2,-94,-111,0,2346,-1,-1,-1;-");
strBuf_12.append("1,2,-94,-109,0,2346,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114");
strBuf_12.append(",-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/a/p");
strBuf_12.append("roducts/551703/Bostitch-InPower-Premium-Spring-Powered-Deskt");
strBuf_12.append("op/-1,2,-94,-115,1,45232,32,2346,2346,0,49892,3863,0,1656951");
strBuf_12.append("370395,28,17725,0,12,2954,1,0,3864,34908,0,6477B517AA19C8A6D");
strBuf_12.append("24FA64BF87FBEC1~-1~YAAQb4PXF2gCDreBAQAAaXv/yQiwnpa6isKoABpDl");
strBuf_12.append("aQ2p8twlwEVHjDRY8LFz+5YVleuP44OiYDTIuqR7UlUZM2avUGheNkqoEFr6");
strBuf_12.append("4YD9M3Negz5DscLjd1NlsDftdQ5kPUm0kL2D0xK+T2/okqlg2FK2mHCipkwv");
strBuf_12.append("2M0QNjNhiEDYQRcYDdiL1L/yHHWSXVLO9oGojUC+Q8jJEdL7+YwqVF+JRSWz");
strBuf_12.append("Um1yYVZukvU4J9QhzG2v6+2Bj7iZCpwVJ807GAQfYPJadlR45fPBwNXBuUc5");
strBuf_12.append("FzvFeAyr7RE8P0lgMg0u1qUK/FCdFgv9uCkDrgMTcvRbMXpTk+S0WXS3TQsx");
strBuf_12.append("7HhihL+/O+jTaId+0ZL5d2CUBRm8S/0dt0BbKWrtQN1ulUisfSWO7cuU9NLD");
strBuf_12.append("gl2~-1~-1~-1,36782,143,688859606,30261693,PiZtE,20912,102,14");
strBuf_12.append(",true-1,2,-94,-106,1,2-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,");
strBuf_12.append("1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127");
strBuf_12.append(",21321144241322243122-1,2,-94,-70,273720021;-851345892;dis;,");
strBuf_12.append("7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80,53");
strBuf_12.append("72-1,2,-94,-116,4111197-1,2,-94,-118,121395-1,2,-94,-129,,,7");
strBuf_12.append("69baa1e58c97f68e09ccec638eeebbd00639644b5049f8a3ec95a8672a5b");
strBuf_12.append("0cb,,,,0-1,2,-94,-121,;3;15;0\"}");
String requestData_12 = strBuf_12.toString();
			
	HTTPPostDataChunk pdc_11 = new HTTPPostDataChunk("A1ECFBB4C85BD7B0E519B06161363232", postData, requestData_12, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_11);

	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C85BD80BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "api.officedepot.io", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "161", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_13(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8270C23E519B06161363232"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1ECFBB4C85BD80EE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_13(HTTPPostData postData) {
				StringBuffer strBuf_13 = new StringBuffer();
strBuf_13.append("{\n  \"session_id\": \"0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd\",\n ");
strBuf_13.append(" \"cookie_id\": \"12345\",\n  \"current_cat\": \"Reduced Effort \\u00");
strBuf_13.append("26 Basic Staplers\",\n  \"current_sku\": \"551703\",\n  \"viewed_cat");
strBuf_13.append("\": []\n}");
String requestData_13 = strBuf_13.toString();
			
	HTTPPostDataChunk pdc_12 = new HTTPPostDataChunk("A1ECFBB4C85BFF06E519B06161363232", postData, requestData_13, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_12);

	}
}
