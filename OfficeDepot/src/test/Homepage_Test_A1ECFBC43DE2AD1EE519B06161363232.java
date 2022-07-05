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
public class Homepage_Test_A1ECFBC43DE2AD1EE519B06161363232 extends LTTestScript  {

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

	
	public Homepage_Test_A1ECFBC43DE2AD1EE519B06161363232(IContainer container, String invocationId) {
		super(container, "Homepage", invocationId, "A1ECFBC43DE2AD1EE519B06161363232");
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
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Homepage_Test_A1ECFBC43DE2AD1EE519B06161363232 ",e);
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

		action.setMapFile("A1ECFBC43DE2AD1EE519B06161363232");

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
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4C1172F9EE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "officedepot.com", "A1ECFBB4C1172F9EE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1ECFBB4C1172F90E519B06161363232", true, true,
						"Config_1", "/",	"/", true, false), 0, 100, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1172FACE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
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
			"A1ECFBB4C1172FAFE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(301);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(1093, 1, parent, parent, "A1ECFBB4C1186811E519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Office Depot OfficeMax | Official Online Store", "A1ECFBB4C1186811E519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(8, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1ECFBB4C1184100E519B06161363232", true, false,
						"Config_2", "/",	"/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1ECFBB4C1188F58E519B06161363232", true, false,
						"Config_3", "/",	"/", true, false), 5, 100, "A1ECFBB4C1186815E519B06161363232", 3);
				httpParallel.addRequest(2, request_4(this, false, "A1ECFBB4C1190450E519B06161363232", false, true,
						"Config_4", "/",	"/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_5(this, false, "A1ECFBB4C11B7558E519B06161363232", false, false,
						"Config_4", "/styles/od/master.min.5c50de2a13.css",	"/styles/od/master.min.5c50de2a13.css", true, false), 5, 100, "A1ECFBB4C1188F60E519B06161363232", 3);
				httpParallel.addRequest(2, request_6(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/styles/od/master_integration.min.9fff906f06.css",	"/styles/od/master_integration.min.9fff906f06.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_7(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/styles/od/home.min.29c4974d9e.css",	"/styles/od/home.min.29c4974d9e.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_8(this, false, "A1ECFBB4C11B7558E519B06161363232", false, false,
						"Config_4", "/styles/od/promoCouponOffer.min.f052d92eba.css",	"/styles/od/promoCouponOffer.min.f052d92eba.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_9(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/styles/od/catalog.min.5a99e51adb.css",	"/styles/od/catalog.min.5a99e51adb.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_10(this, false, "A1ECFBB4C11B7558E519B06161363232", false, false,
						"Config_4", "/styles/od/product.min.107359d744.css",	"/styles/od/product.min.107359d744.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_11(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/styles/od/promo.min.944a7319eb.css",	"/styles/od/promo.min.944a7319eb.css", true, false), 718, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_12(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/resource/css/5752/b373928af1d699ec7ecd59634738a191/officedepot.css",	"/resource/css/5752/b373928af1d699ec7ecd59634738a191/officedepot.css", true, false), 117, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(5, request_13(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/styles/global_header.min.43bdc2f4ab72509b3666.css",	"/styles/global_header.min.43bdc2f4ab72509b3666.css", true, false), 121, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(6, request_14(this, false, "A1ECFBB4C137FE3CE519B06161363232", false, false,
						"Config_4", "/styles/global_header_persistent_ad_banner.min.572b4edcb5a3ca106554.css",	"/styles/global_header_persistent_ad_banner.min.572b4edcb5a3ca106554.css", true, false), 115, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(3, request_15(this, false, "A1ECFBB4C11B7558E519B06161363232", false, false,
						"Config_4", "/js/vendor.min.03c9568d477777bf48bc68a05179b80c.js",	"/js/vendor.min.03c9568d477777bf48bc68a05179b80c.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_16(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/js/od/polyfills.min.65154f27d7.js",	"/js/od/polyfills.min.65154f27d7.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_17(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/js/od/master.min.5207ac93c9.js",	"/js/od/master.min.5207ac93c9.js", true, false), 122, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(6, request_18(this, false, "A1ECFBB4C137FE3CE519B06161363232", false, false,
						"Config_4", "/resource/js/5752/ccee5184099bcbed20d3836cb8acfd3/officedepot.js",	"/resource/js/5752/ccee5184099bcbed20d3836cb8acfd3/officedepot.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_19(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/js/react.min.808706b2a48846c498f2c78838ef1de8.js",	"/js/react.min.808706b2a48846c498f2c78838ef1de8.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_20(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/js/global_vars.min.15b120702102e07d268b.js",	"/js/global_vars.min.15b120702102e07d268b.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_21(this, false, "A1ECFBB4C11B7558E519B06161363232", false, false,
						"Config_4", "/js/global_header_persistent_ad_banner.min.840d16a3865b853e3444.js",	"/js/global_header_persistent_ad_banner.min.840d16a3865b853e3444.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_22(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/js/global_header.min.162716bfb3fc61f47538.js",	"/js/global_header.min.162716bfb3fc61f47538.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_23(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/styles/global_footer.min.7e2a206d5effc90b09d9.css",	"/styles/global_footer.min.7e2a206d5effc90b09d9.css", true, false), 1694, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(6, request_24(this, false, "A1ECFBB4C137FE3CE519B06161363232", false, false,
						"Config_4", "/js/od/promoCouponOffer.min.a64674e9ef.js",	"/js/od/promoCouponOffer.min.a64674e9ef.js", true, false), 1700, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(5, request_25(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/js/od/pagebuilder.min.89d2e75f46.js",	"/js/od/pagebuilder.min.89d2e75f46.js", true, false), 1700, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(2, request_26(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/js/od/product.min.4b742f299b.js",	"/js/od/product.min.4b742f299b.js", true, false), 1700, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(3, request_27(this, false, "A1ECFBB4C11B7558E519B06161363232", true, false,
						"Config_4", "/styles/business_select.min.4957f754587baf40831a.css",	"/styles/business_select.min.4957f754587baf40831a.css", true, false), 1700, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_28(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/styles/products_rail.min.059bce0908eec301bc6c.css",	"/styles/products_rail.min.059bce0908eec301bc6c.css", true, false), 1701, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_29(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/js/products_rail.min.4cf72b10c23be0bce58a.js",	"/js/products_rail.min.4cf72b10c23be0bce58a.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_30(this, false, "A1ECFBB4C137FE3CE519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_31(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/js/cm_ga_conversion.min.af481c4d1f9e60f10569.js",	"/js/cm_ga_conversion.min.af481c4d1f9e60f10569.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_32(this, false, "A1ECFBB4C1190450E519B06161363232", true, false,
						"Config_4", "/akam/13/93e9fc3",	"/akam/13/93e9fc3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_33(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/fm/files/od/inktoner_v2/new_brand_tiles/350x191_epson.png",	"/fm/files/od/inktoner_v2/new_brand_tiles/350x191_epson.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_34(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/resource/blob/52/180e82018d1c6ea639900946dd899732/loader-big-gif-data.gif",	"/resource/blob/52/180e82018d1c6ea639900946dd899732/loader-big-gif-data.gif", true, false), 1018, 100, "A1ECFBB4C1369E7EE519B06161363232", 2);
				httpParallel.addRequest(4, request_35(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/js/analytics_monetate.min.1cd6c20f821df6414488.js",	"/js/analytics_monetate.min.1cd6c20f821df6414488.js", true, false), 2128, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(5, request_36(this, false, "A1ECFBB4C137AFE0E519B06161363232", true, false,
						"Config_4", "/js/print.min.d48100ea4f05518488a1.js",	"/js/print.min.d48100ea4f05518488a1.js", true, false), 2291, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_37(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/js/business_select.min.302846b0b19233a6511e.js",	"/js/business_select.min.302846b0b19233a6511e.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_38(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/js/remove_sw.min.d0cd10b0f20ea453eab8.js",	"/js/remove_sw.min.d0cd10b0f20ea453eab8.js", true, false), 2328, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(7, request_39(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 3711, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(7, request_40(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 5277, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_41(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=1&cachebuster=841849434",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=1&cachebuster=841849434", true, false), 5456, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_42(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/tags/11024/tag.js",	"/proxy/mczbf/tags/11024/tag.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_43(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/resource/blob/38220/d58e2bf1f66bc015371d6d466fe464e8/carousel-btn-sprites-png-data.png",	"/resource/blob/38220/d58e2bf1f66bc015371d6d466fe464e8/carousel-btn-sprites-png-data.png", true, false), 4746, 100, "A1ECFBB4C1369E7EE519B06161363232", 2);
				httpParallel.addRequest(7, request_44(this, false, "A1ECFBB4C13984F3E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 6035, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(4, request_45(this, false, "A1ECFBB4C1369E70E519B06161363232", true, false,
						"Config_4", "/akam/13/pixel_93e9fc3",	"/akam/13/pixel_93e9fc3", true, false), 6045, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(7, request_46(this, false, "A1ECFBB4C13984F3E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do?items=348037,101095,8597554,959569,810846,7730356,7049485,196517,7476425,749969,907932,8167316,161444,6129456,633410,8818764,8944121,576868,493876,956652,347005,6217486,751724,356076,7808444",	"/mobile/getAjaxPriceListFromService.do?items=348037,101095,8597554,959569,810846,7730356,7049485,196517,7476425,749969,907932,8167316,161444,6129456,633410,8818764,8944121,576868,493876,956652,347005,6217486,751724,356076,7808444", true, false), 7263, 100, "A1ECFBB4C119045EE519B06161363232", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1186815E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
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
			"A1ECFBB4C1186818E519B06161363232",
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

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1188F60E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1186815E519B06161363232"), 3);		
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
			"A1ECFBB4C1188F63E519B06161363232",
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

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C119045EE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C1190461E519B06161363232",
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

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C11B7566E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C11B7569E519B06161363232",
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

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1336A20E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C1336A23E519B06161363232",
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

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C133B893E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C133B896E519B06161363232",
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

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1345480E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C1345483E519B06161363232",
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

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C134A2F2E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C134A2F5E519B06161363232",
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

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C13517D0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C13517D3E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C135DB5FE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C135DB62E519B06161363232",
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

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1369E7EE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C1369E81E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C137AFEEE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C137AFF1E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C137FE4AE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C137FE4DE519B06161363232",
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

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1384C73E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C1384C76E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1390F70E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C1390F73E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1398501E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C1398504E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1436FB0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C1436FB3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C14655E0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C14655E3E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C14851B3E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C14851B6E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1491503E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C1491506E519B06161363232",
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

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C149B163E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C149B166E519B06161363232",
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

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C14AE9C0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C14AE9C3E519B06161363232",
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

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C14B8600E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C14B8603E519B06161363232",
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

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C14C226FE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C14C2272E519B06161363232",
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

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C179E900E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C179E903E519B06161363232",
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

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17AD363E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C17AD366E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17B96B0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);		
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
			"A1ECFBB4C17B96B3E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17BE51BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C17BE51EE519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17CA823E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C17CA826E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17D1D93E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C17D1D96E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17DB9A0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C17DB9A3E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17E2EC0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C17E2EC3E519B06161363232",
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

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17E561BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/resource/css/5752/b373928af1d699ec7ecd59634738a191/officedepot.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17CA823E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C17E561EE519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17EA3F0E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17CA823E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C17EA3F3E519B06161363232",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C17FB563E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17CA823E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C17FB566E519B06161363232",
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

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C18003D3E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17CA823E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);		
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
			"A1ECFBB4C18003D6E519B06161363232",
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

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1813C03E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17CA823E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C1813C06E519B06161363232",
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

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C181D845E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1503", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656951342259%22%3A%7B%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17CA823E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C181D848E519B06161363232",
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
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_1.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_1.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_1.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1343232,2560,1401,25");
strBuf_1.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_1.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.14292019");
strBuf_1.append("371,828475671615.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,d");
strBuf_1.append("m_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0");
strBuf_1.append(",0,0,0,-1,310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101");
strBuf_1.append(",-1,0;0,0,0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94,");
strBuf_1.append("-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103");
strBuf_1.append(",-1,2,-94,-112,https://www.officedepot.com/-1,2,-94,-115,1,3");
strBuf_1.append("2,32,0,0,0,0,4,0,1656951343231,-999999,17725,0,0,2954,0,0,6,");
strBuf_1.append("0,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4PXF9L9DbeBAQAA");
strBuf_1.append("dgH/yQjV7kCxLpoN0SsLqlStn2KXLGSXCEXrbMEQvmdwqyR3Dpn2n13k6LgI");
strBuf_1.append("yj3hby4Q02OE8eh37IgkySxTXQUYLsDlu/TG6naYim/BC1tKuz7bfmxxJbvd");
strBuf_1.append("QOmPRiRBEgYDiQ4ULr1DIt/ndCMMge42jZQn1zh6i5YYXyWbTudkEF/jgjdE");
strBuf_1.append("U1bXzz6rvdKQ9UaAbGl25wuSQ3ZqlX1niUy/Wug1mqPzLs1Mb8fJwcIrteM0");
strBuf_1.append("JoPhvqnILotT2egyAEh9P5PcrzEhxclftKy68+/sD0Uic62xVLWXVxgS7e5q");
strBuf_1.append("PrpCxfTqBN0HeWpqXpE37AsIKg0EtulNCBj4NmoH7V+GfQAd2CMaXl1qnzgQ");
strBuf_1.append("kic0rv1te5SNntpbnhMcTkm+~-1~-1~-1,38085,-1,-1,30261693,PiZtE");
strBuf_1.append(",31982,48,14,true-1,2,-94,-106,0,0-1,2,-94,-119,-1-1,2,-94,-");
strBuf_1.append("122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-");
strBuf_1.append("1,2,-94,-127,8-1,2,-94,-70,-1-1,2,-94,-80,94-1,2,-94,-116,20");
strBuf_1.append("148270-1,2,-94,-118,90208-1,2,-94,-129,-1,2,-94,-121,;10;-1;");
strBuf_1.append("0\"}");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1ECFBB4C1822660E519B06161363232", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C1827484E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1760", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656951342259%22%3A%7B%7D%7D;_gcl_au=1.1.438863400.1656951343", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C181D845E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C1827487E519B06161363232",
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
strBuf_2.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.26942133");
strBuf_2.append("9134,828475671615.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_2.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_2.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_2.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_2.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0");
strBuf_2.append(",0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,0,3,1005,548,91,31");
strBuf_2.append("0;-1,2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1");
strBuf_2.append(",2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/-1,2,-");
strBuf_2.append("94,-115,1,1679,32,0,0,0,1647,1005,0,1656951343231,269,17725,");
strBuf_2.append("0,1,2954,1,0,1301,1005,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1");
strBuf_2.append("~YAAQb4PXFwv+DbeBAQAAvgn/yQgnBTDGUzc3spcCOvr9vkSPoMhrJ9r4aBw");
strBuf_2.append("Wj9J1uz8b4opD/AKlrPE/sYbp+XtnzO7SJ0mM+oIDt9XFog6HiqaktDMMoCh");
strBuf_2.append("GP1uiTGQkzwzuW5ZVhSFMNXyzYkHQVvpFUuItV6Vpr7sdIpFKrjP7Bg2Iv3R");
strBuf_2.append("SCvtJ68yK8Wr+5kyYexEbpPh0Pig+sTzWKUras8UfkKspTl89KEqQJ3XsNM2");
strBuf_2.append("y2Gij0l/gAt3ldX6csQCveXO9Feo9TrDJz+ZVWZ+/MstXgqTTnmszTIjOPt4");
strBuf_2.append("HayZyk7BFh3VXkTZgJQEGhlxha/Wt3kOnPK7mfs0eJOEbkf7fpNSh76x+uw7");
strBuf_2.append("p3nOkkGcfTNhY1+ZVSvWqN0/GXLAo3qkat94NISkChF1y~-1~||1-ugvpNbG");
strBuf_2.append("KzL-1-10-1000-2||~-1,40124,15,-1319905047,30261693,PiZtE,690");
strBuf_2.append("45,41,14,true-1,2,-94,-106,1,1-1,2,-94,-119,-1-1,2,-94,-122,");
strBuf_2.append("0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,");
strBuf_2.append("-94,-127,8-1,2,-94,-70,273720021;-851345892;dis;,7;true;true");
strBuf_2.append(";true;-60;true;24;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,");
strBuf_2.append("-116,20148270-1,2,-94,-118,102181-1,2,-94,-129,,,0,,,,0-1,2,");
strBuf_2.append("-94,-121,;446;16;1\"}");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1ECFBB4C1829B90E519B06161363232", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C182C2F2E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656951342259%22%3A%7B%7D%7D;_gcl_au=1.1.438863400.1656951343", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C181D845E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);		
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
			"A1ECFBB4C182C2F5E519B06161363232",
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

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C183110BE519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656951342259%22%3A%7B%7D%7D;_gcl_au=1.1.438863400.1656951343", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1827484E519B06161363232"), 3);		
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
			"A1ECFBB4C183110EE519B06161363232",
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

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C18385F0E519B06161363232", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/resource/css/5752/b373928af1d699ec7ecd59634738a191/officedepot.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656951342259%22%3A%7B%7D%7D;_gcl_au=1.1.438863400.1656951343", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1827484E519B06161363232"), 3);		
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
			"A1ECFBB4C18385F3E519B06161363232",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C183AD03E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1832", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\"", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1827484E519B06161363232"), 3);		
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
			"A1ECFBB4C183AD06E519B06161363232",
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
strBuf_3.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.85911709");
strBuf_3.append("6429,828475671615.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_3.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_3.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_3.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_3.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0");
strBuf_3.append(",0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,0,3,1005,548,91,31");
strBuf_3.append("0;1,1,1482,548,91;2,4,1485,548,91,310;3,2,1980,548,91,310;-1");
strBuf_3.append(",2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-");
strBuf_3.append("94,-103,-1,2,-94,-112,https://www.officedepot.com/-1,2,-94,-");
strBuf_3.append("115,1,8556,32,0,0,0,8524,2333,0,1656951343231,14,17725,0,4,2");
strBuf_3.append("954,2,0,2336,5952,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQ");
strBuf_3.append("b4PXFx/+DbeBAQAAWg//yQhQUjruMarplLQQjF+PXvoRe0sgmR5A4g3oMoe3");
strBuf_3.append("iHZjaW4cPHAor0+7Wyt4NvhDYVnpD997aYMCI3kDgZm/4L3ic0JhN/IgiMtv");
strBuf_3.append("BegOm/38wRry2zk9iEYdRyxPVdWWk48AEWVIrlTVXuY2uQkwfcVx3LtgW3S/");
strBuf_3.append("lpTLWrWP6WmXir/ob/gaSiZgMMXFUNYP6Kt9S8gbzsBqTauaQqHznoziwn+t");
strBuf_3.append("QxHpQMXwk2Pszq0jsGljdxurRS1BITOXKcobIXg24gCrOP6/8R/uy2aQmjfF");
strBuf_3.append("BT9zTJLCtf7lBz3dF1VZFFhBDOOh2ajJK7BsyfpW6RhVXu6lJXajrkixhqIh");
strBuf_3.append("O8lriuGdYXET7v77nHmuZcwjLn45La11mF7Do8o7~-1~||1-ugvpNbGKzL-1");
strBuf_3.append("-10-1000-2||~-1,39990,121,-360798511,30261693,PiZtE,15499,89");
strBuf_3.append(",14,true-1,2,-94,-106,9,2-1,2,-94,-119,-1-1,2,-94,-122,0,0,1");
strBuf_3.append(",0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-");
strBuf_3.append("127,21321144241322243122-1,2,-94,-70,273720021;-851345892;di");
strBuf_3.append("s;,7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80");
strBuf_3.append(",5372-1,2,-94,-116,20148270-1,2,-94,-118,105879-1,2,-94,-129");
strBuf_3.append(",,,0,,,,0-1,2,-94,-121,;5;16;0\"}");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1ECFBB4C183D410E519B06161363232", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C183FB71E519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3557", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\"", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C17DB9A0E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1827484E519B06161363232"), 3);		
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
			"A1ECFBB4C183FB74E519B06161363232",
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
	private void postDataClass_4(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("ap=true&bt=%7B%22charging%22%3Atrue%2C%22chargingTime%22%3A0");
strBuf_4.append("%2C%22dischargingTime%22%3A%22Infinity%22%2C%22level%22%3A1%");
strBuf_4.append("2C%22onchargingchange%22%3Anull%2C%22onchargingtimechange%22");
strBuf_4.append("%3Anull%2C%22ondischargingtimechange%22%3Anull%2C%22onlevelc");
strBuf_4.append("hange%22%3Anull%7D&fonts=null&fh=null&timing=%7B%221%22%3A16");
strBuf_4.append("1%2C%222%22%3A2041%2C%22profile%22%3A%7B%22bp%22%3A1%2C%22sr");
strBuf_4.append("%22%3A0%2C%22dp%22%3A0%2C%22lt%22%3A1%2C%22ps%22%3A1%2C%22cv");
strBuf_4.append("%22%3A120%2C%22fp%22%3A0%2C%22sp%22%3A4%2C%22br%22%3A0%2C%22");
strBuf_4.append("ieps%22%3A0%2C%22av%22%3A0%2C%22z1%22%3A28%2C%22jsv%22%3A2%2");
strBuf_4.append("C%22nav%22%3A1%2C%22nap%22%3A2%2C%22crc%22%3A0%2C%22z2%22%3A");
strBuf_4.append("2%7D%2C%22main%22%3A3997%2C%22compute%22%3A161%2C%22send%22%");
strBuf_4.append("3A2042%7D&bp=2087755996%2C1953464915%2C591862434%2C325835597");
strBuf_4.append("%2C1068473606%2C-1382186647%2C-365096851%2C-1979186206%2C-10");
strBuf_4.append("8039040%2C-1906852049&sr=%7B%22inner%22%3A%5B1240%2C891%5D%2");
strBuf_4.append("C%22outer%22%3A%5B1255%2C1024%5D%2C%22screen%22%3A%5B-2042%2");
strBuf_4.append("C-112%5D%2C%22pageOffset%22%3A%5B0%2C0%5D%2C%22avail%22%3A%5");
strBuf_4.append("B2560%2C1401%5D%2C%22size%22%3A%5B2560%2C1441%5D%2C%22client");
strBuf_4.append("%22%3A%5B1223%2C6302%5D%2C%22colorDepth%22%3A24%2C%22pixelDe");
strBuf_4.append("pth%22%3A24%7D&dp=%7B%22XDomainRequest%22%3A0%2C%22createPop");
strBuf_4.append("up%22%3A0%2C%22removeEventListener%22%3A1%2C%22globalStorage");
strBuf_4.append("%22%3A0%2C%22openDatabase%22%3A1%2C%22indexedDB%22%3A1%2C%22");
strBuf_4.append("attachEvent%22%3A0%2C%22ActiveXObject%22%3A0%2C%22dispatchEv");
strBuf_4.append("ent%22%3A1%2C%22addBehavior%22%3A0%2C%22addEventListener%22%");
strBuf_4.append("3A1%2C%22detachEvent%22%3A0%2C%22fireEvent%22%3A0%2C%22Mutat");
strBuf_4.append("ionObserver%22%3A1%2C%22HTMLMenuItemElement%22%3A0%2C%22Int8");
strBuf_4.append("Array%22%3A1%2C%22postMessage%22%3A1%2C%22querySelector%22%3");
strBuf_4.append("A1%2C%22getElementsByClassName%22%3A1%2C%22images%22%3A1%2C%");
strBuf_4.append("22compatMode%22%3A%22CSS1Compat%22%2C%22documentMode%22%3A0%");
strBuf_4.append("2C%22all%22%3A1%2C%22now%22%3A1%2C%22contextMenu%22%3A0%7D&l");
strBuf_4.append("t=1656951343538%2B1&ps=true%2Ctrue&cv=257625ef7abc3cc6026bfa");
strBuf_4.append("2db36e13f0313cb2ca&fp=false&sp=false&br=Chrome&ieps=false&av");
strBuf_4.append("=false&z=%7B%22a%22%3A155098570%2C%22b%22%3A1%2C%22c%22%3A1%");
strBuf_4.append("7D&zh=&jsv=1.7&nav=%7B%22userAgent%22%3A%22Mozilla%2F5.0%20(");
strBuf_4.append("Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537");
strBuf_4.append(".36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F102.0.5005.63%20S");
strBuf_4.append("afari%2F537.36%22%2C%22appName%22%3A%22Netscape%22%2C%22appC");
strBuf_4.append("odeName%22%3A%22Mozilla%22%2C%22appVersion%22%3A%225.0%20(Wi");
strBuf_4.append("ndows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.3");
strBuf_4.append("6%20(KHTML%2C%20like%20Gecko)%20Chrome%2F102.0.5005.63%20Saf");
strBuf_4.append("ari%2F537.36%22%2C%22appMinorVersion%22%3A0%2C%22product%22%");
strBuf_4.append("3A%22Gecko%22%2C%22productSub%22%3A%2220030107%22%2C%22vendo");
strBuf_4.append("r%22%3A%22Google%20Inc.%22%2C%22vendorSub%22%3A%22%22%2C%22b");
strBuf_4.append("uildID%22%3A0%2C%22platform%22%3A%22Win32%22%2C%22oscpu%22%3");
strBuf_4.append("A0%2C%22hardwareConcurrency%22%3A12%2C%22language%22%3A%22en");
strBuf_4.append("-GB%22%2C%22languages%22%3A%5B%22en-GB%22%2C%22en-US%22%2C%2");
strBuf_4.append("2en%22%5D%2C%22systemLanguage%22%3A0%2C%22userLanguage%22%3A");
strBuf_4.append("0%2C%22doNotTrack%22%3Anull%2C%22msDoNotTrack%22%3A0%2C%22co");
strBuf_4.append("okieEnabled%22%3Atrue%2C%22geolocation%22%3A1%2C%22vibrate%2");
strBuf_4.append("2%3A1%2C%22maxTouchPoints%22%3A0%2C%22webdriver%22%3Atrue%2C");
strBuf_4.append("%22plugins%22%3A%5B%22PDF%20Viewer%22%2C%22Chrome%20PDF%20Vi");
strBuf_4.append("ewer%22%2C%22Chromium%20PDF%20Viewer%22%2C%22Microsoft%20Edg");
strBuf_4.append("e%20PDF%20Viewer%22%2C%22WebKit%20built-in%20PDF%22%5D%7D&cr");
strBuf_4.append("c=%7B%22window.chrome%22%3A%7B%22app%22%3A%7B%22isInstalled%");
strBuf_4.append("22%3Afalse%2C%22InstallState%22%3A%7B%22DISABLED%22%3A%22dis");
strBuf_4.append("abled%22%2C%22INSTALLED%22%3A%22installed%22%2C%22NOT_INSTAL");
strBuf_4.append("LED%22%3A%22not_installed%22%7D%2C%22RunningState%22%3A%7B%2");
strBuf_4.append("2CANNOT_RUN%22%3A%22cannot_run%22%2C%22READY_TO_RUN%22%3A%22");
strBuf_4.append("ready_to_run%22%2C%22RUNNING%22%3A%22running%22%7D%7D%7D%7D&");
strBuf_4.append("t=7f2365eedfc9c7cda59e852d71aef7213ec972d3&u=ad934277cabf59e");
strBuf_4.append("8adb18fa7eec12a5f");
String requestData_4 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1ECFBB4C1842240E519B06161363232", postData, requestData_4, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECFBB4C184497BE519B06161363232", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_gcl_au=1.1.438863400.1656951343;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656951345294%22%3A%7B%22AC7444TEST%22%3A1%2C%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=g9r27t4hzfp&ss=l56y1phe&sl=0&tt=0\";_ga_MZ424N4G1Y=GS1.1.1656951345.1.0.1656951346.59;_mibhv=anon-1656951346163-5726727044_5124;_cls_v=ebc2bf0f-a819-4b6a-a8a7-0a024c1a93c9;_cls_s=814be6d0-b940-41b6-94b6-d9c33140fc38:0;_ga=GA1.2.793288138.1656951346;_gid=GA1.2.128201478.1656951347", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
				
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C119045EE519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C1188F60E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C183FB71E519B06161363232"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECFBB4C183AD03E519B06161363232"), 3);		
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
			"A1ECFBB4C184497EE519B06161363232",
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
}
