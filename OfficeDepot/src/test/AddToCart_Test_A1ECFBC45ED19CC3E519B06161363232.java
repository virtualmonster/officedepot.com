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
import com.ibm.rational.test.lt.execution.core.impl.MetaString;
import com.ibm.rational.test.lt.execution.core.impl.ZipEntryProxy;
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
public class AddToCart_Test_A1ECFBC45ED19CC3E519B06161363232 extends LTTestScript  {

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

	
	public AddToCart_Test_A1ECFBC45ED19CC3E519B06161363232(IContainer container, String invocationId) {
		super(container, "Add to Cart", invocationId, "A1ECFBC45ED19CC3E519B06161363232");
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
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: AddToCart_Test_A1ECFBC45ED19CC3E519B06161363232 ",e);
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

		action.setMapFile("A1ECFBC45ED19CC3E519B06161363232");

		// Control file contains transforms 
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
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4C8D17CE0E519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Add To Cart", "A1ECFBB4C8D17CE0E519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1ECFBB4C1F0EDC0E519B06161363232", false, true,
						"Config_4", "/ajaxhtml/addSkuToCartByButton.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?cmd_addSKU.button.INDEX[0]=Add%2520to%2520Cart",	"/ajaxhtml/addSkuToCartByButton.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?cmd_addSKU.button.INDEX[0]=Add%2520to%2520Cart", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_2(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/fm/files/od/testing/2019/couponicon.png",	"/fm/files/od/testing/2019/couponicon.png", true, false), 214, 100, "A1ECFBB4C8D17CE4E519B06161363232", 3);
				httpParallel.addRequest(2, request_3(this, false, "A1ECFBB4C8D21920E519B06161363232", false, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=420994,664011,336977,255876,514228,295825,837398,479608,442306,161636&mapBySkuId=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=420994,664011,336977,255876,514228,295825,837398,479608,442306,161636&mapBySkuId=true", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_4(this, false, "A1ECFBB4C8286BA0E519B06161363232", true, false,
						"Config_4", "/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_5(this, false, "A1ECFBB4C8D21920E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=6577047,8700486,8357591,9652256,8467734,8812004,8971046,9584688,8778165,258901,593247,7147958,141981,479596,938678,490486,108185,4799412,139179,239384,7890125,141747,239400,2708301&&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=6577047,8700486,8357591,9652256,8467734,8812004,8971046,9584688,8778165,258901,593247,7147958,141981,479596,938678,490486,108185,4799412,139179,239384,7890125,141747,239400,2708301&&noSession=true", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_6(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 5, 100, "A1ECFBB4C8D3C6D0E519B06161363232", 3);
				httpParallel.addRequest(3, request_7(this, false, "A1ECFBB4C8FD95F0E519B06161363232", true, false,
						"Config_4", "/akam-sw.js",	"/akam-sw.js", true, false), 3880, 100, "A1ECFBB4C8FCAB90E519B06161363232", 3);
				httpParallel.addRequest(4, request_8(this, false, "A1ECFBB4C8FE0B20E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 4500, 100, "A1ECFBB4C8FD95FEE519B06161363232", 3);
				httpParallel.addRequest(4, request_9(this, false, "A1ECFBB4C8FE0B20E519B06161363232", true, false,
						"Config_4", "/cart/shoppingCart.do",	"/cart/shoppingCart.do", true, false), 0, 100, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8D17CE4E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(19);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "161", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-a25eb40cd26a91cb----1656951374567", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-ca86cf31368954708b906f5417c57530-a25eb40cd26a91cb-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiYTI1ZWI0MGNkMjZhOTFjYiIsInRyIjoiY2E4NmNmMzEzNjg5NTQ3MDhiOTA2ZjU0MTdjNTc1MzAiLCJ0aSI6MTY1Njk1MTM3NDU2NywidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("content-type", "application/x-www-form-urlencoded;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
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
			"ISO-8859-1",
			"A1ECFBB4C8D17CE7E519B06161363232",
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
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("cmATCSourcePage=Product Details Page&trackingCategoryId=6587");
strBuf_1.append("88&entryFormList[0].cmMessage=Product Details Page&entryForm");
strBuf_1.append("List[0].sku=551703&entryFormList[0].qty=1");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1ECFBB4C8D1A425E519B06161363232", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8D1CB66E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951374.31;BVBRANDID=91158347-8ee2-4e1b-9f1c-39f8a4d01182;BVBRANDSID=1bae481f-ca74-4c8a-a818-93e82440eb81", "ISO-8859-1", 1));

				
			
					
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
			"ISO-8859-1",
			"ISO-8859-1",
			"A1ECFBB4C8D1CB69E519B06161363232",
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

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8D2192EE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-599fa90411a87d62----1656951375113", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-94cca07bbcbfacd9e02a4e49530f68c0-599fa90411a87d62-01", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiNTk5ZmE5MDQxMWE4N2Q2MiIsInRyIjoiOTRjY2EwN2JiY2JmYWNkOWUwMmE0ZTQ5NTMwZjY4YzAiLCJ0aSI6MTY1Njk1MTM3NTExMywidGsiOiIyNDU3NTY1In19", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951374.31;BVBRANDID=91158347-8ee2-4e1b-9f1c-39f8a4d01182;BVBRANDSID=1bae481f-ca74-4c8a-a818-93e82440eb81;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8D17CE4E519B06161363232"), 3);		
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
			"ISO-8859-1",
			"ISO-8859-1",
			"A1ECFBB4C8D21931E519B06161363232",
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

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8D3C6D0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(18);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-7ab56324d4b559af----1656951375161", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-6869f8335d09cb58466e523cf8e36780-7ab56324d4b559af-01", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiN2FiNTYzMjRkNGI1NTlhZiIsInRyIjoiNjg2OWY4MzM1ZDA5Y2I1ODQ2NmU1MjNjZjhlMzY3ODAiLCJ0aSI6MTY1Njk1MTM3NTE2MSwidGsiOiIyNDU3NTY1In19", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951374.31;BVBRANDID=91158347-8ee2-4e1b-9f1c-39f8a4d01182;BVBRANDSID=1bae481f-ca74-4c8a-a818-93e82440eb81;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8D17CE4E519B06161363232"), 3);		
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
			"ISO-8859-1",
			"ISO-8859-1",
			"A1ECFBB4C8D3C6D3E519B06161363232",
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

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8D43C00E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-ac32965ebfdcb29b----1656951375382", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-42d4013f72b54f56a57584fd8d83af00-ac32965ebfdcb29b-01", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiYWMzMjk2NWViZmRjYjI5YiIsInRyIjoiNDJkNDAxM2Y3MmI1NGY1NmE1NzU4NGZkOGQ4M2FmMDAiLCJ0aSI6MTY1Njk1MTM3NTM4MiwidGsiOiIyNDU3NTY1In19", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;_clsk=2hfucc|1656951366595|1|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951374.31;BVBRANDID=91158347-8ee2-4e1b-9f1c-39f8a4d01182;BVBRANDSID=1bae481f-ca74-4c8a-a818-93e82440eb81;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8D17CE4E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8D3C6D0E519B06161363232"), 3);		
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
			"ISO-8859-1",
			"ISO-8859-1",
			"A1ECFBB4C8D43C03E519B06161363232",
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

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8FCAB90E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-eb391af90f94a080----1656951375162", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-f82994a0627188dd980deda9be0bb3c0-eb391af90f94a080-01", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiZWIzOTFhZjkwZjk0YTA4MCIsInRyIjoiZjgyOTk0YTA2MjcxODhkZDk4MGRlZGE5YmUwYmIzYzAiLCJ0aSI6MTY1Njk1MTM3NTE2MiwidGsiOiIyNDU3NTY1In19", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("content-type", "application/json", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "ISO-8859-1", 1));

				
			
					
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
			"ISO-8859-1",
			"ISO-8859-1",
			"A1ECFBB4C8FCAB93E519B06161363232",
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

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8FD95FEE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Service-Worker", "script", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "same-origin", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "serviceworker", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;kampyleSessionPageCounter=1;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D3;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951375.30;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"0bd9e9e6c2e9ce340e6e1c7754b228ce5bb931351fb503a6d95b245f121c9540\"", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Sat, 23 Oct 2021 01:47:33 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8FCAB90E519B06161363232"), 3);		
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
			"ISO-8859-1",
			"UTF-8",
			"A1ECFBB4C8FD9601E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
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

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8FE0B32E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "4242", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-bb7ec204c1019690----1656951384816", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-f6d114d6faee966be32c4f03bae3e090-bb7ec204c1019690-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiYmI3ZWMyMDRjMTAxOTY5MCIsInRyIjoiZjZkMTE0ZDZmYWVlOTY2YmUzMmM0ZjAzYmFlM2UwOTAiLCJ0aSI6MTY1Njk1MTM4NDgxNiwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=2&tt=8p0&obo=1&rl=1\";salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951375.30;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8FCAB90E519B06161363232"), 3);		
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
			"A1ECFBB4C8FE0B35E519B06161363232",
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
					String requestData_2 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1ECFBC45ED19CC3E519B06161363232.testdata",
	                                   "A1ECFBB4C8FE323DE519B06161363232",
	                                   4242));
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1ECFBB4C8FE323DE519B06161363232", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C8FE8050E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951375.30;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1&nu=7ea380554c784d24488c745740f45a35&cl=xqn&ld=xsl&r=a3a0f4088bb8fa16b456ad06a252a9d3&ul=xsn\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8D17CE4E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C8FCAB90E519B06161363232"), 3);		
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
			"A1ECFBB4C8FE8053E519B06161363232",
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
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(174, 1, parent, parent, "A1ECFBB4C9B32A5EE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Shopping Cart", "A1ECFBB4C9B32A5EE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_10(this, true, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/styles/cart_react.min.1b55cc581bebefa9aba6.css",	"/styles/cart_react.min.1b55cc581bebefa9aba6.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_11(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_12(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", true, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 136, 100, "A1ECFBB4C9B32A62E519B06161363232", 3);
				httpParallel.addRequest(0, request_13(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=7&cachebuster=1365547199",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=7&cachebuster=1365547199", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_14(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 364, 100, "A1ECFBB4C9E02E13E519B06161363232", 3);
				httpParallel.addRequest(0, request_15(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/async/cart/getCartInfo.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartInfo.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 183, 100, "A1ECFBB4C9E07BE0E519B06161363232", 3);
				httpParallel.addRequest(2, request_16(this, false, "A1ECFBB4C9E0F17DE519B06161363232", false, false,
						"Config_4", "/async/cart/getCartOrderSummary.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartOrderSummary.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_17(this, false, "A1ECFBB4C9E11893E519B06161363232", true, false,
						"Config_4", "/async/cart/saveForLater/getSkus.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/saveForLater/getSkus.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_18(this, false, "A1ECFBB4C9E0F17DE519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_19(this, false, "A1ECFBB4C9E0F17DE519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=332063&mapBySkuId=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=332063&mapBySkuId=true", true, false), 182, 100, "A1ECFBB4C9E1668FE519B06161363232", 3);
				httpParallel.addRequest(0, request_20(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/async/cart/getCartSavingsMessages.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartSavingsMessages.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 200, 100, "A1ECFBB4C9E1668FE519B06161363232", 3);
				httpParallel.addRequest(0, request_21(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/async/cart/getCartCoupons.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartCoupons.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_22(this, false, "A1ECFBB4C9B32A50E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=801187,348037&mapBySkuId=true&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=801187,348037&mapBySkuId=true&noSession=true", true, false), 257, 100, "A1ECFBB4C9E229EDE519B06161363232", 3);
				httpParallel.addRequest(4, request_23(this, false, "A1ECFBB4C9E29F1DE519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703&mapBySkuId=true&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703&mapBySkuId=true&noSession=true", true, false), 206, 100, "A1ECFBB4C9E1668FE519B06161363232", 3);
				httpParallel.addRequest(5, request_24(this, false, "A1ECFBB4CA020DA0E519B06161363232", true, false,
						"Config_4", "/cart/checkout.do",	"/cart/checkout.do", true, false), 1942, 100, "A1ECFBB4C9E29F2BE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9B32A62E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951385.20;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1&nu=7ea380554c784d24488c745740f45a35&cl=xqn&ld=xsl&r=a3a0f4088bb8fa16b456ad06a252a9d3&ul=xsn&hd=yf0\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4C9B32A65E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9B5E970E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951385.20;RT=\"z=1&dm=officedepot.com&si=do1m04bkrpd&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1&nu=7ea380554c784d24488c745740f45a35&cl=xqn&ld=xsl&r=a3a0f4088bb8fa16b456ad06a252a9d3&ul=xsn&hd=yf0\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4C9B5E973E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E006B0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "519", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-ac8c9077e1026bb1----1656951386911", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-9efd46459e1e8efd9e934923bb036910-ac8c9077e1026bb1-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiYWM4YzkwNzdlMTAyNmJiMSIsInRyIjoiOWVmZDQ2NDU5ZTFlOGVmZDllOTM0OTIzYmIwMzY5MTAiLCJ0aSI6MTY1Njk1MTM4NjkxMSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("content-type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
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
			"A1ECFBB4C9E006B3E519B06161363232",
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
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("id=a7dc10dd-a11d-4a5c-b84e-78ed356c2759&tagId=11024&fullRefe");
strBuf_2.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fcart%2FshoppingC");
strBuf_2.append("art.do&payload=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%");
strBuf_2.append("221523082%22%2C%22cartSubtotal%22%3A%2224.990%22%2C%22tracki");
strBuf_2.append("ngSource%22%3A%22gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22");
strBuf_2.append("%22%3A%7B%22userId%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C");
strBuf_2.append("%22marketing_channel%22%3A%22In%20Progress%22%7D%7D%7D&isDev");
strBuf_2.append("iceAccessGranted=false&cjUser=00000000-0000-0000-0000-000000");
strBuf_2.append("000000&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_3 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1ECFBB4C9E00718E519B06161363232", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E02E13E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951385.20;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4C9E02E16E519B06161363232",
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

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E07BE0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1419", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-388d421ee6182a8e----1656951387462", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-3b7b481f72b0a4adfc042eabf29ae3b0-388d421ee6182a8e-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMzg4ZDQyMWVlNjE4MmE4ZSIsInRyIjoiM2I3YjQ4MWY3MmIwYTRhZGZjMDQyZWFiZjI5YWUzYjAiLCJ0aSI6MTY1Njk1MTM4NzQ2MiwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_ga=GA1.1.793288138.1656951346", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
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
			"A1ECFBB4C9E07BE3E519B06161363232",
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
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_3.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_3.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_3.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1387440,2560,1401,25");
strBuf_3.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_3.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.92850918");
strBuf_3.append("7464,828475693719.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_3.append("dm_en,t_en-1,2,-94,-105,-1,2,-94,-102,-1,2,-94,-108,-1,2,-94");
strBuf_3.append(",-110,-1,2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-11");
strBuf_3.append("4,-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/ca");
strBuf_3.append("rt/shoppingCart.do-1,2,-94,-115,1,32,32,0,0,0,0,2,0,16569513");
strBuf_3.append("87439,-999999,17725,0,0,2954,0,0,8,0,0,6477B517AA19C8A6D24FA");
strBuf_3.append("64BF87FBEC1~-1~YAAQb4PXF18DDreBAQAAfa3/yQjvHGzJxT8DLIixRCDUJ");
strBuf_3.append("MgltQGx3EjvDR/alalnqZitraX3h2w/acIVnO+lU9OhARfIsj0k2KJ13+BL2");
strBuf_3.append("I2VrNDmXb9E7r8k5BEhxkAOvUoL3rCHX+AstD1krID7Cpb0s86FMK3yNqcwk");
strBuf_3.append("RUOChcCglmjBfLGKY1MXgTrxz/HrRlYmeqwIsz5ncNlL6MwzZpyiMTT37l5D");
strBuf_3.append("cLymjEGo8Y+P4GNLtGLOX2MsI9gXvLCKgZrJ9kWlLuz7ChnoOpiL2QEkgVD9");
strBuf_3.append("/EYTVzgJ96YS4+FLAqcIS185mKhqQw/mQev2IcjbLvoe2O496yXx1wMrKoYC");
strBuf_3.append("ZKYhdGmQmur1dgtvdQmDTsYpCsQEsBXWE3FkYdh6XUW42rJs5rc55D5ZUOk~");
strBuf_3.append("-1~-1~-1,37309,-1,-1,30261693,PiZtE,15073,76,14,true-1,2,-94");
strBuf_3.append(",-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94");
strBuf_3.append(",-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-7");
strBuf_3.append("0,-1-1,2,-94,-80,94-1,2,-94,-116,936521784-1,2,-94,-118,8655");
strBuf_3.append("2-1,2,-94,-129,-1,2,-94,-121,;16;-1;0\"}");
String requestData_4 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1ECFBB4C9E0A301E519B06161363232", postData, requestData_4, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E0CA23E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-69e63fa2ecbe9bf1----1656951387934", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-627cc35763262644b7cd6a8ba5f76c30-69e63fa2ecbe9bf1-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiNjllNjNmYTJlY2JlOWJmMSIsInRyIjoiNjI3Y2MzNTc2MzI2MjY0NGI3Y2Q2YThiYTVmNzZjMzAiLCJ0aSI6MTY1Njk1MTM4NzkzNCwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_ga=GA1.1.793288138.1656951346", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);		
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
			"A1ECFBB4C9E0CA26E519B06161363232",
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

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E0F18BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-055803f9b8166ddf----1656951387935", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-4172c5256a73e887a73f6b1992f09980-055803f9b8166ddf-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMDU1ODAzZjliODE2NmRkZiIsInRyIjoiNDE3MmM1MjU2YTczZTg4N2E3M2Y2YjE5OTJmMDk5ODAiLCJ0aSI6MTY1Njk1MTM4NzkzNSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_ga=GA1.1.793288138.1656951346", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);		
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
			"A1ECFBB4C9E0F18EE519B06161363232",
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

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E13F3CE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-39fd5a3d5bcece9e----1656951387937", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-b436a5198c6a4755d1dd0d8e3dda5b30-39fd5a3d5bcece9e-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMzlmZDVhM2Q1YmNlY2U5ZSIsInRyIjoiYjQzNmE1MTk4YzZhNDc1NWQxZGQwZDhlM2RkYTViMzAiLCJ0aSI6MTY1Njk1MTM4NzkzNywidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_ga=GA1.1.793288138.1656951346", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);		
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
			"A1ECFBB4C9E13F3FE519B06161363232",
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

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E1668FE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1674", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-8b2844fa713cf3ae----1656951388104", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-f322242ee47c685f4180c9c491a92b30-8b2844fa713cf3ae-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiOGIyODQ0ZmE3MTNjZjNhZSIsInRyIjoiZjMyMjI0MmVlNDdjNjg1ZjQxODBjOWM0OTFhOTJiMzAiLCJ0aSI6MTY1Njk1MTM4ODEwNCwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_ga=GA1.1.793288138.1656951346;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);		
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
			"A1ECFBB4C9E16692E519B06161363232",
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
	private void postDataClass_5(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_4.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_4.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_4.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1387440,2560,1401,25");
strBuf_4.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_4.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.89405930");
strBuf_4.append("9447,828475693719.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_4.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_4.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_4.append("-1,2,-94,-105,-1,2,-94,-102,-1,2,-94,-108,-1,2,-94,-110,0,1,");
strBuf_4.append("33,1067,381;1,1,512,1065,381;2,1,620,1064,381;-1,2,-94,-117,");
strBuf_4.append("-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2");
strBuf_4.append(",-94,-112,https://www.officedepot.com/cart/shoppingCart.do-1");
strBuf_4.append(",2,-94,-115,1,5542,32,0,0,0,5510,660,0,1656951387439,33,1772");
strBuf_4.append("5,0,3,2954,0,0,661,1165,0,6477B517AA19C8A6D24FA64BF87FBEC1~-");
strBuf_4.append("1~YAAQb4PXF4QDDreBAQAAO7b/yQh9u9HZYtTkTauGFOF+BrzeX+aNnj4wLM");
strBuf_4.append("jXomXB9YH9DLpzS6XkqOdl/DJ94VXHLgFExKoBtz5DKSBpjqaLTbMGe87a8k");
strBuf_4.append("kfUSrzbOCShaTvfx1rv9KEc3TXagEZ76CfLSs28Jpw3JBF2ZxP935EEMlP+o");
strBuf_4.append("lhZV3lylqJUYOOKUrLMKRly9sG2TdYoKtwa1xMcxqT/UUVwDC+Zp2giJAvwU");
strBuf_4.append("CkPTVbGxvGuNYcCFrfvkphh5WjSRShpDk2e9p6hK85hRnKqEpaCbfDg0S8dh");
strBuf_4.append("SfiedUKCcpJORrauriwnvVVxNCR8W6nhSqmB8NmRJkSX0Fia2pq6hNsu/gmG");
strBuf_4.append("cniyHy+RZOEM9GoTCCSKEfk2q3382QHFa13NdXkeELkXlJ~-1~-1~-1,3762");
strBuf_4.append("9,412,1136889246,30261693,PiZtE,68163,106,14,true-1,2,-94,-1");
strBuf_4.append("06,9,1-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-1");
strBuf_4.append("23,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-70,2");
strBuf_4.append("73720021;-851345892;dis;,7;true;true;true;-60;true;24;24;tru");
strBuf_4.append("e;false;-1-1,2,-94,-80,5372-1,2,-94,-116,936521784-1,2,-94,-");
strBuf_4.append("118,98144-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;4;25;0\"}");
String requestData_5 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1ECFBB4C9E18D61E519B06161363232", postData, requestData_5, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E1B47EE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-4dd10c8b6a96baca----1656951388644", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-665d4771102aa145801e26682245de90-4dd10c8b6a96baca-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiNGRkMTBjOGI2YTk2YmFjYSIsInRyIjoiNjY1ZDQ3NzExMDJhYTE0NTgwMWUyNjY4MjI0NWRlOTAiLCJ0aSI6MTY1Njk1MTM4ODY0NCwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E1668FE519B06161363232"), 3);		
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
			"A1ECFBB4C9E1B481E519B06161363232",
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

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E20283E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-27de89779b6c83d3----1656951388651", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-22f590b3a8dbc7eb6315d297dddda2d0-27de89779b6c83d3-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiMjdkZTg5Nzc5YjZjODNkMyIsInRyIjoiMjJmNTkwYjNhOGRiYzdlYjYzMTVkMjk3ZGRkZGEyZDAiLCJ0aSI6MTY1Njk1MTM4ODY1MSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E1668FE519B06161363232"), 3);		
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
			"A1ECFBB4C9E20286E519B06161363232",
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

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E229EDE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-c1380b10bf0f76b2----1656951388652", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-72656f2246fe9744f90e1057d9bb3450-c1380b10bf0f76b2-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiYzEzODBiMTBiZjBmNzZiMiIsInRyIjoiNzI2NTZmMjI0NmZlOTc0NGY5MGUxMDU3ZDliYjM0NTAiLCJ0aSI6MTY1Njk1MTM4ODY1MiwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;mt.mbsh=%7B%221656951373076%22%3A%7B%22ODNA114130TEST%22%3A1%2C%22AC6860TEST%22%3A1%2C%22AC7364TEST%22%3A1%7D%7D;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951386.19;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E1668FE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E07BE0E519B06161363232"), 3);		
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
			"A1ECFBB4C9E229F0E519B06161363232",
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

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E25114E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-88932160ddf30ac6----1656951389331", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-b91283d9ef227792299d46f0915a5fa0-88932160ddf30ac6-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiODg5MzIxNjBkZGYzMGFjNiIsInRyIjoiYjkxMjgzZDllZjIyNzc5MjI5OWQ0NmYwOTE1YTVmYTAiLCJ0aSI6MTY1Njk1MTM4OTMzMSwidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951388.17", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E1668FE519B06161363232"), 3);		
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
			"A1ECFBB4C9E277B1E519B06161363232",
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

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C9E29F2BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("tracestate", "2457565@nr=0-1-2687855-515667111-cdc070f1d23bdec8----1656951389357", "UTF-8", 1));			
		headers.add(new RequestHeaderData("traceparent", "00-7eb87a5b6d0ca26b8ba53d5eea699020-cdc070f1d23bdec8-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("newrelic", "eyJ2IjpbMCwxXSwiZCI6eyJ0eSI6IkJyb3dzZXIiLCJhYyI6IjI2ODc4NTUiLCJhcCI6IjUxNTY2NzExMSIsImlkIjoiY2RjMDcwZjFkMjNiZGVjOCIsInRyIjoiN2ViODdhNWI2ZDBjYTI2YjhiYTUzZDVlZWE2OTkwMjAiLCJ0aSI6MTY1Njk1MTM4OTM1NywidGsiOiIyNDU3NTY1In19", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_clsk=2hfucc|1656951376491|2|0|l.clarity.ms/collect;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=3&tt=if6&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951389.16", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E1668FE519B06161363232"), 3);		
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
			"A1ECFBB4C9E29F2EE519B06161363232",
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

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA020DB2E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/shoppingCart.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951389.16;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C9E1668FE519B06161363232"), 3);		
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
			"A1ECFBB4CA020DB5E519B06161363232",
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
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4CA622F0EE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Cart Login", "A1ECFBB4CA622F0EE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_25(this, true, "A1ECFBB4CA622F00E519B06161363232", true, false,
						"Config_4", "/styles/od/account.min.823d86a6f5.css",	"/styles/od/account.min.823d86a6f5.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_26(this, false, "A1ECFBB4CA62A47BE519B06161363232", true, false,
						"Config_4", "/styles/od/checkoutV2Header.min.1d97df3671.css",	"/styles/od/checkoutV2Header.min.1d97df3671.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_27(this, false, "A1ECFBB4CA62CBA7E519B06161363232", true, false,
						"Config_4", "/styles/od/account_integration.min.4051f2f157.css",	"/styles/od/account_integration.min.4051f2f157.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_28(this, false, "A1ECFBB4CA636780E519B06161363232", true, false,
						"Config_4", "/styles/recaptcha_enterprise.min.712177548971d49d8f2f.css",	"/styles/recaptcha_enterprise.min.712177548971d49d8f2f.css", true, false), 104, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(4, request_29(this, false, "A1ECFBB4CA63B5F1E519B06161363232", true, false,
						"Config_4", "/js/od/expRegistration.min.1ec0e3f781.js",	"/js/od/expRegistration.min.1ec0e3f781.js", true, false), 194, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(5, request_30(this, false, "A1ECFBB4CA6403C3E519B06161363232", true, false,
						"Config_4", "/js/od/passwordStrengthMeter.min.9052c56f7c.js",	"/js/od/passwordStrengthMeter.min.9052c56f7c.js", true, false), 185, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(6, request_31(this, false, "A1ECFBB4CA6478F0E519B06161363232", true, false,
						"Config_4", "/js/od/smallbizcheckout.min.085006e460.js",	"/js/od/smallbizcheckout.min.085006e460.js", true, false), 337, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(7, request_32(this, false, "A1ECFBB4CA64A053E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 326, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(8, request_33(this, false, "A1ECFBB4CA651530E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=99&cachebuster=171948624",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=99&cachebuster=171948624", true, false), 327, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(8, request_34(this, false, "A1ECFBB4CA651530E519B06161363232", false, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_35(this, false, "A1ECFBB4CA651530E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 194, 100, "A1ECFBB4CA653C8BE519B06161363232", 3);
				httpParallel.addRequest(9, request_36(this, false, "A1ECFBB4CA675F44E519B06161363232", true, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 25, 100, "A1ECFBB4CA63B5FFE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA622F12E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA622F15E519B06161363232",
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

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA62A489E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA62A48CE519B06161363232",
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

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA62F250E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA62F253E519B06161363232",
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

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA63678EE519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA636791E519B06161363232",
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

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA63B5FFE519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA63B602E519B06161363232",
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

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA6403D1E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA6403D4E519B06161363232",
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

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA6478FEE519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA647901E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA64A061E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA64A064E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA65153EE519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;_ga=GA1.2.793288138.1656951346;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951392.13;RT=\"z=1&dm=officedepot.com&si=p5nqn2vvzps&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1&nu=b12a2a9e1e2cf32565957d66d4a129dd&cl=12w0&ld=12xy&r=7ea380554c784d24488c745740f45a35&ul=12y0&hd=1393\"", "UTF-8", 1));

				
			
					
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
			"A1ECFBB4CA651541E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA653C8BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1491", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;BVBRANDID=2e541a28-9a49-4e2f-844c-d88f268afb4e;BVBRANDSID=5ca7508d-faf4-4066-80d9-0d4fb85bb315;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951393.12;_ga=GA1.1.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=gvihf7lwvn5&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1\"", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
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
			"A1ECFBB4CA653C8EE519B06161363232",
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
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_5.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_5.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_5.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1394231,2560,1401,25");
strBuf_5.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_5.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.64094065");
strBuf_5.append("0320,828475697115.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_5.append("dm_en,t_en-1,2,-94,-105,0,2,0,0,1015,922,0;1,-1,0,0,1388,883");
strBuf_5.append(",0;-1,2,-94,-102,0,2,0,0,1015,922,0;1,-1,0,0,1388,883,0;-1,2");
strBuf_5.append(",-94,-108,-1,2,-94,-110,-1,2,-94,-117,-1,2,-94,-111,-1,2,-94");
strBuf_5.append(",-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://www.");
strBuf_5.append("officedepot.com/cart/checkout.do-1,2,-94,-115,1,32,32,0,0,0,");
strBuf_5.append("0,1,0,1656951394231,-999999,17725,0,0,2954,0,0,3,0,0,6477B51");
strBuf_5.append("7AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4PXF5EDDreBAQAA0Lj/yQjllrR");
strBuf_5.append("6vRjTyvjsc1sytJ8lFFWjOQn3AKs56cefLXXHcWgRKXZhFT/+2BIg+c+2lUt");
strBuf_5.append("Pf9+ZBzd8dRTw/XC+90NaaWu21nsqux/nd1neCplvRHgb7KzwLFKhuSrnNun");
strBuf_5.append("aYj055MUYe0cPp3UgGaIRhsKGgb5WYSqi/b9dMlJ+tnJkSuI0kCDstKQQVyX");
strBuf_5.append("aiW10NeuwG+fFQSkB4cce4lg8tQrM5YEvZ80pnuGkaQo79eMffzZizwDhgy5");
strBuf_5.append("fEtJ7PxHtrLAu7+eQEdhOHAXrV832dZ53OiEB7VnFU9cw1klWwkhMdIkjsy2");
strBuf_5.append("E76zMiBPddSxmcEhdw38vsf2pBeb6X+H556IiaXgl07mEwHVKIAdL8sIx+++");
strBuf_5.append("b7FVoZB0bxb7c~-1~-1~-1,37380,-1,-1,30261693,PiZtE,66005,74,1");
strBuf_5.append("4,true-1,2,-94,-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0");
strBuf_5.append(",1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-12");
strBuf_5.append("7,8-1,2,-94,-70,-1-1,2,-94,-80,94-1,2,-94,-116,20913420-1,2,");
strBuf_5.append("-94,-118,89921-1,2,-94,-129,-1,2,-94,-121,;8;-1;0\"}");
String requestData_6 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1ECFBB4CA656364E519B06161363232", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA671100E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1764", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_gid=GA1.2.128201478.1656951347;xdVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;atgRecVisitorId=13C1WxRvQmPNWgC3437ftIUZFVIvqXGE5M_r5oojk6uStZs4C47;cjConsent=MHxZfDB8Tnww;_rdt_uuid=1656951350051.7793513d-7e4e-4235-a261-ad861cc8e40e;_dc_gtm_UA-102713874-13=1;atgRecSessionId=aDjJ_xypcElTkmIEAhEgY_nJgcthJjUSMNV4xSOJCn_usiWE8mfz!2027638152!130902159;_scid=1139e658-dce4-4bce-b48d-efaec7c78961;_fbp=fb.1.1656951351094.204154848;NoCookie=true;mt.sac_1=t;_pin_unauth=dWlkPU4yVmpZak0xT0RjdE1tVXpOaTAwWlRnMExXRTNOemt0TnprMVpqSXpaamxtT1dZNQ;FINID=fbfc0c4caadb99a1e0bf0a6ec94298af;_clck=1a1h015|1|f2v|0;mdLogger=false;kampyle_userid=0da9-1590-2b94-6154-3e09-6430-4b8c-50fd;kampyleUserSession=1656951364542;kampyleUserSessionsCount=1;salsify_session_id=6c5e8848-d375-41e6-948a-acd4b424f0b2;_tt_enable_cookie=1;_ttp=5b567188-cba9-405e-b339-3830cd6a8eb7;BVImplmain_site=2563;_br_uid_2=uid%3D4975320271852%3Av%3D15.0%3Ats%3D1656951350119%3Ahc%3D4;kampyleSessionPageCounter=2;_aeaid=10fc331e-bd1b-4580-a8de-c934857b8c67;aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D;aelastsite=wEOeRi5JsNLJ8fGoDSrBTk3q8T4OUtKc8d9SEhtkc1noNoQ0WzUPPaLijCdPhmbw;aeatstartmessage=true;eeStep=1;mt.mbsh=%7B%221656951388712%22%3A%7B%7D%7D;cpdExpressDefault=true;_clsk=2hfucc|1656951390009|3|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656951345.1.1.1656951393.12;_ga=GA1.1.793288138.1656951346;RT=\"z=1&dm=officedepot.com&si=gvihf7lwvn5&ss=l56y1phe&sl=4&tt=nkg&obo=1&rl=1\";_uetsid=923ee5f0fbb411ec915a836f4645fe53;_uetvid=923f2db0fbb411ecbf10f9ca90d8a337;BVBRANDID=79ffe0b3-b88c-4ceb-9e86-8feb35245392;BVBRANDSID=be1dcadc-42e7-43fe-9af9-163bc38fa5cc", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4CA653C8BE519B06161363232"), 3);		
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
			"A1ECFBB4CA671103E519B06161363232",
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
				StringBuffer strBuf_6 = new StringBuffer();
strBuf_6.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_6.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_6.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_6.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1394231,2560,1401,25");
strBuf_6.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_6.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.08278582");
strBuf_6.append("541,828475697115.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_6.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_6.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_6.append("1,2,-94,-105,0,2,0,0,1015,922,0;1,-1,0,0,1388,883,0;-1,2,-94");
strBuf_6.append(",-102,0,2,0,0,1015,922,0;1,-1,0,0,1388,883,0;-1,2,-94,-108,-");
strBuf_6.append("1,2,-94,-110,-1,2,-94,-117,-1,2,-94,-111,0,221,-1,-1,-1;-1,2");
strBuf_6.append(",-94,-109,0,219,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,");
strBuf_6.append("2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/cart/ch");
strBuf_6.append("eckout.do-1,2,-94,-115,1,32,32,221,219,0,440,558,0,165695139");
strBuf_6.append("4231,31,17725,0,0,2954,0,0,560,440,0,6477B517AA19C8A6D24FA64");
strBuf_6.append("BF87FBEC1~-1~YAAQb4PXF90DDreBAQAArdD/yQhLl+PF8EcdH5jXHK3M44P");
strBuf_6.append("5UligFkPxwIeWqchasqzBQjCrJ0qg/mfqYV+zmopH8mjZQJgTJijZkYOCxj4");
strBuf_6.append("8Nd+rGJKUeSWlEz7y+XzOBPNoc7bhh3rMnBiHJpTN7wdpDcMnNziUhGIdd3H");
strBuf_6.append("Xadvk+BPseuz/B0zABzfYszeVSg4WsJ1WrCb5Gdc92LT6jl5DW113QQt18hK");
strBuf_6.append("SJivGSXUopWTZBPEcxISPTWfE+4uXt08lruLjR/a97a/SbvIz462vsFru30Q");
strBuf_6.append("1TmeStPoLHrxUqlGr66easbi2zXeV+AFv4LuR8fbW0Ju523IAfLdFyxjDkyz");
strBuf_6.append("507BICBkVMy5fTsPMaQs4WHDP9r+gFIXKqlZ7f3DP3GwSx1NjaQL7NbJo~-1");
strBuf_6.append("~-1~-1,37281,395,-140118619,30261693,PiZtE,106578,47,14,true");
strBuf_6.append("-1,2,-94,-106,9,1-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0");
strBuf_6.append("-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,2132");
strBuf_6.append("1144241322243122-1,2,-94,-70,273720021;-851345892;dis;,7;tru");
strBuf_6.append("e;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80,5372-1,");
strBuf_6.append("2,-94,-116,20913420-1,2,-94,-118,101829-1,2,-94,-129,,,0,,,,");
strBuf_6.append("0-1,2,-94,-121,;8;12;0\"}");
String requestData_7 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1ECFBB4CA673824E519B06161363232", postData, requestData_7, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4CA675F52E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "515", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/cart/checkout.do", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
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
			"A1ECFBB4CA675F55E519B06161363232",
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
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("id=f3a4d4b7-5f38-4c37-b4b2-f16aa44329d3&tagId=11024&fullRefe");
strBuf_7.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fcart%2Fcheckout.");
strBuf_7.append("do&payload=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%2215");
strBuf_7.append("23082%22%2C%22cartSubtotal%22%3A%2224.990%22%2C%22trackingSo");
strBuf_7.append("urce%22%3A%22gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22%22%");
strBuf_7.append("3A%7B%22userId%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C%22m");
strBuf_7.append("arketing_channel%22%3A%22In%20Progress%22%7D%7D%7D&isDeviceA");
strBuf_7.append("ccessGranted=false&cjUser=00000000-0000-0000-0000-0000000000");
strBuf_7.append("00&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_8 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1ECFBB4CA675FAEE519B06161363232", postData, requestData_8, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}
}
