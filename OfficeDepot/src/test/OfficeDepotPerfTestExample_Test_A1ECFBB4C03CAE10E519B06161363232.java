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
public class OfficeDepotPerfTestExample_Test_A1ECFBB4C03CAE10E519B06161363232 extends LTTestScript  {

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

	
	public OfficeDepotPerfTestExample_Test_A1ECFBB4C03CAE10E519B06161363232(IContainer container, String invocationId) {
		super(container, "OfficeDepot Perf Test Example", invocationId, "A1ECFBB4C03CAE10E519B06161363232");
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
	this.add(page_5(this));
	this.add(page_6(this));
	this.add(page_7(this));
	this.add(page_8(this));
	this.add(page_9(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: OfficeDepotPerfTestExample_Test_A1ECFBB4C03CAE10E519B06161363232 ",e);
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

		action.setMapFile("A1ECFBB4C03CAE10E519B06161363232");

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
				httpParallel.addRequest(2, request_32(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/akam/13/93e9fc3",	"/akam/13/93e9fc3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_33(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/fm/files/od/inktoner_v2/new_brand_tiles/350x191_epson.png",	"/fm/files/od/inktoner_v2/new_brand_tiles/350x191_epson.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_34(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
						"Config_4", "/resource/blob/52/180e82018d1c6ea639900946dd899732/loader-big-gif-data.gif",	"/resource/blob/52/180e82018d1c6ea639900946dd899732/loader-big-gif-data.gif", true, false), 1018, 100, "A1ECFBB4C1369E7EE519B06161363232", 2);
				httpParallel.addRequest(4, request_35(this, false, "A1ECFBB4C1369E70E519B06161363232", false, false,
						"Config_4", "/js/analytics_monetate.min.1cd6c20f821df6414488.js",	"/js/analytics_monetate.min.1cd6c20f821df6414488.js", true, false), 2128, 100, "A1ECFBB4C119045EE519B06161363232", 2);
				httpParallel.addRequest(5, request_36(this, false, "A1ECFBB4C137AFE0E519B06161363232", false, false,
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
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4C189A07FE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Search", "A1ECFBB4C189A07FE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_47(this, true, "A1ECFBB4C189A071E519B06161363232", true, false,
						"Config_5", "/services/splunkjslogger/beacon.gif?src=GRAPHQL%20API%20call%20for%20Persistent%20Banner%20failed.&severity=error&msg=%7B%20error%3A%20TypeError%3A%20Cannot%20read%20properties%20of%20null%20(reading%20%27simplecardByPath%27)%2C%20msg%3A%20%27GRAPHQL%20API%20to%20retrieve%20response%20for%20for%20Persistent%20Banner%20in%20Header%20App%20failed.%27%7D&pageUrl=undefined&isClient=true&glassboxUrl=undefined",	"/services/splunkjslogger/beacon.gif?src=GRAPHQL%20API%20call%20for%20Persistent%20Banner%20failed.&severity=error&msg=%7B%20error%3A%20TypeError%3A%20Cannot%20read%20properties%20of%20null%20(reading%20%27simplecardByPath%27)%2C%20msg%3A%20%27GRAPHQL%20API%20to%20retrieve%20response%20for%20for%20Persistent%20Banner%20in%20Header%20App%20failed.%27%7D&pageUrl=undefined&isClient=true&glassboxUrl=undefined", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_48(this, false, "A1ECFBB4C137AFE0E519B06161363232", true, false,
						"Config_4", "/styles/print.min.b06979a8c55fd07eb565.css",	"/styles/print.min.b06979a8c55fd07eb565.css", true, false), 519, 100, "A1ECFBB4C189A083E519B06161363232", 3);
				httpParallel.addRequest(2, request_49(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 120, 100, "A1ECFBB4C189EE90E519B06161363232", 3);
				httpParallel.addRequest(3, request_50(this, false, "A1ECFBB4C1190450E519B06161363232", false, false,
						"Config_4", "/akam-sw.js",	"/akam-sw.js", true, false), 479, 100, "A1ECFBB4C1F0EDCEE519B06161363232", 3);
				httpParallel.addRequest(4, request_51(this, false, "A1ECFBB4C1F1D820E519B06161363232", true, false,
						"Config_5", "/services/predictsearch-service/api/2/?searchTerm=stapler",	"/services/predictsearch-service/api/2/?searchTerm=stapler", true, false), 481, 100, "A1ECFBB4C1F0EDCEE519B06161363232", 3);
				httpParallel.addRequest(3, request_52(this, false, "A1ECFBB4C1190450E519B06161363232", true, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 521, 100, "A1ECFBB4C1F1D82EE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	private void postDataClass_5(HTTPPostData postData) {
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("id=4575eee0-1288-463d-80ba-707c30c152cd&tagId=11024&fullRefe");
strBuf_5.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2F&payload=%7B%22s");
strBuf_5.append("itePage%22%3A%7B%22enterpriseId%22%3A%221523082%22%2C%22cart");
strBuf_5.append("Subtotal%22%3A%220%22%2C%22trackingSource%22%3A%22gtm%22%2C%");
strBuf_5.append("22pageType%22%3A%22N%2FA%22%2C%22%22%3A%7B%22userId%22%3A%22");
strBuf_5.append("%22%2C%22emailHash%22%3A%22%22%2C%22marketing_channel%22%3A%");
strBuf_5.append("22In%20Progress%22%7D%7D%7D&isDeviceAccessGranted=false&cjUs");
strBuf_5.append("er=00000000-0000-0000-0000-000000000000&cookies=");
String requestData_5 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1ECFBB4C1F114D9E519B06161363232", postData, requestData_5, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	private void postDataClass_6(HTTPPostData postData) {
				StringBuffer strBuf_6 = new StringBuffer();
strBuf_6.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_6.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_6.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_6.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1343232,2560,1401,25");
strBuf_6.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_6.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.90902849");
strBuf_6.append("3454,828475671615.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_6.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_6.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_6.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_6.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0");
strBuf_6.append(",0,0,-1,310,1;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_6.append("0,-1,622,0;-1,-1,1,0,-1,706,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-");
strBuf_6.append("1,219,0;-1,-1,1,0,-1,220,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1");
strBuf_6.append("18,0;-1,-1,1,0,-1,214,0;-1,-1,1,0,-1,427,0;-1,-1,1,0,-1,418,");
strBuf_6.append("0;-1,-1,1,0,-1,421,0;-1,-1,1,0,-1,511,0;-1,-1,1,0,-1,632,0;-");
strBuf_6.append("1,-1,1,0,-1,434,0;-1,-1,1,0,-1,360,0;-1,-1,1,0,-1,629,0;-1,-");
strBuf_6.append("1,1,0,-1,622,0;-1,2,-94,-108,0,1,5429,-2,0,0,310;1,3,5914,-2");
strBuf_6.append(",0,0,310;2,2,5923,-2,0,0,310;3,1,5925,-2,0,0,310;4,3,5926,-2");
strBuf_6.append(",0,0,310;5,2,5940,-2,0,0,310;6,1,5942,-2,0,0,310;7,3,5943,-2");
strBuf_6.append(",0,0,310;8,2,5947,-2,0,0,310;9,1,5949,-2,0,0,310;10,3,5950,-");
strBuf_6.append("2,0,0,310;11,2,5955,-2,0,0,310;12,1,5956,-2,0,0,310;13,3,595");
strBuf_6.append("7,-2,0,0,310;14,2,5962,-2,0,0,310;15,1,5963,-2,0,0,310;16,3,");
strBuf_6.append("5965,-2,0,0,310;17,2,5970,-2,0,0,310;18,1,5973,-2,0,0,310;19");
strBuf_6.append(",3,5975,-2,0,0,310;20,2,6024,-2,0,0,310;-1,2,-94,-110,0,3,10");
strBuf_6.append("05,548,91,310;1,1,1482,548,91;2,4,1485,548,91,310;3,2,1980,5");
strBuf_6.append("48,91,310;4,1,7522,606,91;5,1,7680,700,95;6,1,7872,743,91;7,");
strBuf_6.append("1,7984,744,91;8,1,8697,760,91;9,3,8699,760,91,-1;-1,2,-94,-1");
strBuf_6.append("17,-1,2,-94,-111,0,2642,-1,-1,-1;-1,2,-94,-109,0,2641,-1,-1,");
strBuf_6.append("-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-1");
strBuf_6.append("12,https://www.officedepot.com/-1,2,-94,-115,131209,61920,32");
strBuf_6.append(",2642,2641,0,198379,8699,0,1656951343231,14,17725,21,10,2954");
strBuf_6.append(",3,0,8701,184177,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb");
strBuf_6.append("4PXFz7+DbeBAQAAihL/yQjCOL6YLxCWQOcR0ftYh+kt/fh36KaHsUy7fZw1P");
strBuf_6.append("sym4M8lOnTgBTBppnuiJg9LcDz7SGQcdwWmXdmtXwaeYacKDR1GJc9Fe2mgl");
strBuf_6.append("X95tUdb05tv7yX6kRVZ1B3CP23ChAHdfklYRzgR5lNJK/tKzFANcJvFoo0gy");
strBuf_6.append("7R7GL5yYlMxKdGX5JNxXWA4Mwe9cH8veyEZ9oGEIkBE0EYqNeCnTTm4bnTHH");
strBuf_6.append("r3q6u1Ckmb00y1IP4o+/k6aC9hhVGsuYzWbs4f/GQdYa5ewnUGDSInCfU5ni");
strBuf_6.append("jGrgz5Ky6tAc1swIxfs6K7ji17kFZYApzLINjfUZCxdsO7TM8eanFMkGnPIc");
strBuf_6.append("S2S6dgM0L0HOmHQeWKqd6JtiCxGfOgqtNXsQfSR~-1~||1-ugvpNbGKzL-1-");
strBuf_6.append("10-1000-2||~-1,39489,121,-360798511,30261693,PiZtE,12258,11,");
strBuf_6.append("14,true-1,2,-94,-106,1,3-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,");
strBuf_6.append("0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-1");
strBuf_6.append("27,21321144241322243122-1,2,-94,-70,273720021;-851345892;dis");
strBuf_6.append(";,7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80,");
strBuf_6.append("5372-1,2,-94,-116,20148270-1,2,-94,-118,151999-1,2,-94,-129,");
strBuf_6.append("479507b7234c45186c995a034296add61e679bb70e95994997a64c22e9b0");
strBuf_6.append("d79c,1.5,769baa1e58c97f68e09ccec638eeebbd00639644b5049f8a3ec");
strBuf_6.append("95a8672a5b0cb,Google Inc. (Intel),ANGLE (Intel, Intel(R) UHD");
strBuf_6.append(" Graphics 630 Direct3D11 vs_5_0 ps_5_0, D3D11),95f5b71fe531f");
strBuf_6.append("867faa814bdd4050dd8057206d53ecec1163523560525884870,33-1,2,-");
strBuf_6.append("94,-121,;7;16;0\"}");
String requestData_6 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1ECFBB4C1F22654E519B06161363232", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(498, 1, parent, parent, "A1ECFBB4C3F1C6DEE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "stapler  - Office Depot", "A1ECFBB4C3F1C6DEE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_53(this, true, "A1ECFBB4C3F1C6D0E519B06161363232", true, true,
						"Config_4", "/catalog/search.do?Ntt=stapler",	"/catalog/search.do?Ntt=stapler", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_54(this, false, "A1ECFBB4C3F37487E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_55(this, false, "A1ECFBB4C3F37487E519B06161363232", true, false,
						"Config_4", "/akam-sw-policy.json",	"/akam-sw-policy.json", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_56(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/styles/od/compare.min.24ed94cf7a.css",	"/styles/od/compare.min.24ed94cf7a.css", true, false), 17, 100, "A1ECFBB4C3F37495E519B06161363232", 3);
				httpParallel.addRequest(2, request_57(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/js/od/csl.min.7e5ee1ef3d.js",	"/js/od/csl.min.7e5ee1ef3d.js", true, false), 608, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(3, request_58(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/styles/compare_bar.min.4a2940e846b7889ce3ee.css",	"/styles/compare_bar.min.4a2940e846b7889ce3ee.css", true, false), 47, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_59(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/styles/atc_subscribtion_lightbox.min.90f1733b8dcc72e86eb0.css",	"/styles/atc_subscribtion_lightbox.min.90f1733b8dcc72e86eb0.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_60(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/js/od/compare.min.03e7ab0c20.js",	"/js/od/compare.min.03e7ab0c20.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_61(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/js/od/skuList.min.5b3cf4947a.js",	"/js/od/skuList.min.5b3cf4947a.js", true, false), 142, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_62(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/js/od/localStorageCache.min.94b4cbf9c4.js",	"/js/od/localStorageCache.min.94b4cbf9c4.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_63(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/js/od/search.min.fd2ba1e358.js",	"/js/od/search.min.fd2ba1e358.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_64(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/js/od/protectionplans.min.8cd3245391.js",	"/js/od/protectionplans.min.8cd3245391.js", true, false), 991, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_65(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/js/od/intersectionObserver.min.2b1f47f53d.js",	"/js/od/intersectionObserver.min.2b1f47f53d.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_66(this, false, "A1ECFBB4C3F79383E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 611, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(3, request_67(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/5.gif",	"/images/us/od/reviews/v2/5.gif", true, false), 1264, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(4, request_68(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/4.gif",	"/images/us/od/reviews/v2/4.gif", true, false), 1266, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(2, request_69(this, false, "A1ECFBB4C3F45EE0E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/3.gif",	"/images/us/od/reviews/v2/3.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_70(this, false, "A1ECFBB4C3F8CBFBE519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/2.gif",	"/images/us/od/reviews/v2/2.gif", true, false), 733, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(7, request_71(this, false, "A1ECFBB4C3F919D7E519B06161363232", false, false,
						"Config_4", "/images/us/od/reviews/v2/1.gif",	"/images/us/od/reviews/v2/1.gif", true, false), 767, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(5, request_72(this, false, "A1ECFBB4C3F79383E519B06161363232", false, false,
						"Config_4", "/images/us/od/common/check-green-v2.png",	"/images/us/od/common/check-green-v2.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_73(this, false, "A1ECFBB4C3F8CBFBE519B06161363232", true, false,
						"Config_4", "/images/us/od/common/info-blue.png",	"/images/us/od/common/info-blue.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_74(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/images/us/od/icon_same_day_delivery.png",	"/images/us/od/icon_same_day_delivery.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_75(this, false, "A1ECFBB4C3F45EE0E519B06161363232", true, false,
						"Config_4", "/images/us/od/common/eco_concious.jpg",	"/images/us/od/common/eco_concious.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_76(this, false, "A1ECFBB4C3F919D7E519B06161363232", true, false,
						"Config_4", "/images/us/od/common/eco_concious_recycle.jpg",	"/images/us/od/common/eco_concious_recycle.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_77(this, false, "A1ECFBB4C3F52233E519B06161363232", false, false,
						"Config_4", "/js/compare_bar.min.1b1cbd6e846d1fd8a95a.js",	"/js/compare_bar.min.1b1cbd6e846d1fd8a95a.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_78(this, false, "A1ECFBB4C3F79383E519B06161363232", false, false,
						"Config_4", "/js/atc_subscribtion_lightbox.min.05c42a9f3db82916891b.js",	"/js/atc_subscribtion_lightbox.min.05c42a9f3db82916891b.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_79(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=8&cachebuster=105939246",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=8&cachebuster=105939246", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_80(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 3484, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(5, request_81(this, false, "A1ECFBB4C3F79383E519B06161363232", true, false,
						"Config_4", "/js/sponsoredskus.chunk.min.0a16022d03cc65ca69aa.js",	"/js/sponsoredskus.chunk.min.0a16022d03cc65ca69aa.js", true, false), 3513, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(8, request_82(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 3523, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(9, request_83(this, false, "A1ECFBB4C45A7403E519B06161363232", true, false,
						"Config_5", "/services/predictsearch-service/api/2/;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?searchTerm=stapler",	"/services/predictsearch-service/api/2/;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?searchTerm=stapler", true, false), 1120, 100, "A1ECFBB4C4216250E519B06161363232", 3);
				httpParallel.addRequest(4, request_84(this, false, "A1ECFBB4C3F60C90E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 4514, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(4, request_85(this, false, "A1ECFBB4C3F60C90E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=8700486,8357591,6577047,605703,213448,339681,339801,8363762,108185,139179,4799412,8467734,8812004,588593,938678,2708301,479596,7890125,141747,239400,141981,593247,5318188,239384,258901,9652256,975266&mapBySkuId=true&pr=",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=8700486,8357591,6577047,605703,213448,339681,339801,8363762,108185,139179,4799412,8467734,8812004,588593,938678,2708301,479596,7890125,141747,239400,141981,593247,5318188,239384,258901,9652256,975266&mapBySkuId=true&pr=", true, false), 5044, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
				httpParallel.addRequest(3, request_86(this, false, "A1ECFBB4C3F52233E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 7891, 100, "A1ECFBB4C3F1C6E2E519B06161363232", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_7(postData);
				
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
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_7.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_7.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_7.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1343232,2560,1401,25");
strBuf_7.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_7.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.27558164");
strBuf_7.append("3137,828475671615.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_7.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_7.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_7.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_7.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0");
strBuf_7.append(",0,0,-1,310,1;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_7.append("0,-1,622,0;-1,-1,1,0,-1,706,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-");
strBuf_7.append("1,219,0;-1,-1,1,0,-1,220,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1");
strBuf_7.append("18,0;-1,-1,1,0,-1,214,0;-1,-1,1,0,-1,427,0;-1,-1,1,0,-1,418,");
strBuf_7.append("0;-1,-1,1,0,-1,421,0;-1,-1,1,0,-1,511,0;-1,-1,1,0,-1,632,0;-");
strBuf_7.append("1,-1,1,0,-1,434,0;-1,-1,1,0,-1,360,0;-1,-1,1,0,-1,629,0;-1,-");
strBuf_7.append("1,1,0,-1,622,0;-1,2,-94,-108,0,1,5429,-2,0,0,310;1,3,5914,-2");
strBuf_7.append(",0,0,310;2,2,5923,-2,0,0,310;3,1,5925,-2,0,0,310;4,3,5926,-2");
strBuf_7.append(",0,0,310;5,2,5940,-2,0,0,310;6,1,5942,-2,0,0,310;7,3,5943,-2");
strBuf_7.append(",0,0,310;8,2,5947,-2,0,0,310;9,1,5949,-2,0,0,310;10,3,5950,-");
strBuf_7.append("2,0,0,310;11,2,5955,-2,0,0,310;12,1,5956,-2,0,0,310;13,3,595");
strBuf_7.append("7,-2,0,0,310;14,2,5962,-2,0,0,310;15,1,5963,-2,0,0,310;16,3,");
strBuf_7.append("5965,-2,0,0,310;17,2,5970,-2,0,0,310;18,1,5973,-2,0,0,310;19");
strBuf_7.append(",3,5975,-2,0,0,310;20,2,6024,-2,0,0,310;-1,2,-94,-110,0,3,10");
strBuf_7.append("05,548,91,310;1,1,1482,548,91;2,4,1485,548,91,310;3,2,1980,5");
strBuf_7.append("48,91,310;4,1,7522,606,91;5,1,7680,700,95;6,1,7872,743,91;7,");
strBuf_7.append("1,7984,744,91;8,1,8697,760,91;9,3,8699,760,91,-1;10,1,8720,7");
strBuf_7.append("60,95;11,4,8935,760,95,-1;12,2,9533,760,95,-1;13,1,9562,755,");
strBuf_7.append("91;-1,2,-94,-117,-1,2,-94,-111,0,2642,-1,-1,-1;-1,2,-94,-109");
strBuf_7.append(",0,2641,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-1");
strBuf_7.append("03,-1,2,-94,-112,https://www.officedepot.com/-1,2,-94,-115,1");
strBuf_7.append("31209,102135,32,2642,2641,0,238594,9579,0,1656951343231,14,1");
strBuf_7.append("7725,21,14,2954,4,0,9581,220927,0,6477B517AA19C8A6D24FA64BF8");
strBuf_7.append("7FBEC1~-1~YAAQb4PXF9L+DbeBAQAAhSv/yQg9fovVrf+tYIZLPfLiiioojJ");
strBuf_7.append("aGpdo1jTUMr3UKFhuYvPFTvlv2AayxdhPAYXlN/eV3KthD+GF/eYbClmHiWU");
strBuf_7.append("BA0SdP2B8FOS8k6ow/94wZEW0xHl8IqUwmtbDzh9qyVlDAW/nLx/bhIXiL1y");
strBuf_7.append("CexZA+7MOIZSyyRADZVEweByFjhdXz4A3RRU9tvoMug58wB+3sEq1XESY7in");
strBuf_7.append("vtRRLiYcZYcoy8eDrN+E1WPFcICBsq2BFtma1ts/9Qu9D+LXtOR0LHMRsb3y");
strBuf_7.append("vYvDwHFiBk0n1awvE6ShuHMIg74Zwy/tJznpn1xtjgPmXr9mxT3D2+nYy3e6");
strBuf_7.append("1oZuU32Loo96sage02lgpzHv7pKWsRUSXM0sPgk+BD/ASVYf4JjKTf~-1~||");
strBuf_7.append("1-ugvpNbGKzL-1-10-1000-2||~-1,39587,121,-360798511,30261693,");
strBuf_7.append("PiZtE,60600,38,14,true-1,2,-94,-106,8,4-1,2,-94,-119,-1-1,2,");
strBuf_7.append("-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,0.534b0d0d");
strBuf_7.append("6012e,0.ffbc7b45c65ec,0.4ebd78857d635,0.d5c73138dfee3,0.7c3b");
strBuf_7.append("69728e10c,0.cf056d9c94b1f,0.4c6d8ad444749,0.cd95b966be67f,0.");
strBuf_7.append("86e365807953a,0.47a54d3803b88;1,0,1,1,6,3,2,2,5,6;0,0,1,1,8,");
strBuf_7.append("7,5,5,9,21;6477B517AA19C8A6D24FA64BF87FBEC1,1656951343231,ug");
strBuf_7.append("vpNbGKzL,6477B517AA19C8A6D24FA64BF87FBEC11656951343231ugvpNb");
strBuf_7.append("GKzL,1,1,0.534b0d0d6012e,6477B517AA19C8A6D24FA64BF87FBEC1165");
strBuf_7.append("6951343231ugvpNbGKzL10.534b0d0d6012e,191,118,56,199,149,186,");
strBuf_7.append("134,0,101,253,82,24,194,244,9,201,17,236,169,95,54,90,97,6,2");
strBuf_7.append("15,0,134,68,248,98,127,35,2093,0,1656951352810;-1,2,-94,-126");
strBuf_7.append(",-1,2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;-8");
strBuf_7.append("51345892;dis;,7;true;true;true;-60;true;24;24;true;false;-1-");
strBuf_7.append("1,2,-94,-80,5372-1,2,-94,-116,20148270-1,2,-94,-118,187827-1");
strBuf_7.append(",2,-94,-129,479507b7234c45186c995a034296add61e679bb70e959949");
strBuf_7.append("97a64c22e9b0d79c,1.5,769baa1e58c97f68e09ccec638eeebbd0063964");
strBuf_7.append("4b5049f8a3ec95a8672a5b0cb,Google Inc. (Intel),ANGLE (Intel, ");
strBuf_7.append("Intel(R) UHD Graphics 630 Direct3D11 vs_5_0 ps_5_0, D3D11),9");
strBuf_7.append("5f5b71fe531f867faa814bdd4050dd8057206d53ecec1163523560525884");
strBuf_7.append("870,33-1,2,-94,-121,;4;16;0\"}");
String requestData_7 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1ECFBB4C3F39BD0E519B06161363232", postData, requestData_7, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_8(postData);
				
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
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_8 = new StringBuffer();
strBuf_8.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_8.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_8.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_8.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_8.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_8.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.50328913");
strBuf_8.append("7251,828475678817.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_8.append("dm_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;");
strBuf_8.append("0,0,0,0,-1,310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0");
strBuf_8.append(",2,0,0,1240,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0");
strBuf_8.append(",2,0,0,1243,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0");
strBuf_8.append(",2,0,0,1246,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0");
strBuf_8.append(",2,0,0,1249,2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0");
strBuf_8.append(",2,0,0,1291,2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0");
strBuf_8.append(",2,0,0,1294,2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0");
strBuf_8.append(",2,0,0,1297,2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0");
strBuf_8.append(",2,0,0,1291,2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,0,0,0");
strBuf_8.append(",-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,0,1057,");
strBuf_8.append("1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0,0,1241");
strBuf_8.append(",2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0,0,1244");
strBuf_8.append(",2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0,0,1247");
strBuf_8.append(",2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0,0,1289");
strBuf_8.append(",2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1292");
strBuf_8.append(",2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,0,1295");
strBuf_8.append(",2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,0,1298");
strBuf_8.append(",2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1293");
strBuf_8.append(",2059,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94,-117,-1,2,-94,-");
strBuf_8.append("111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,");
strBuf_8.append("https://www.officedepot.com/catalog/search.do?Ntt=stapler-1,");
strBuf_8.append("2,-94,-115,1,32,32,0,0,0,0,3,0,1656951357635,-999999,17725,0");
strBuf_8.append(",0,2954,0,0,6,0,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4");
strBuf_8.append("PXFw7/DbeBAQAAAjP/yQjjejtUy2eMCwSfwuJiAoH4pUFatjtL5DuX8+aoDT");
strBuf_8.append("WLmTdk4QnZhtaU+Vs+eNocvPL6CrtxDSzzl03M9GExMou+slQPey8KtByndf");
strBuf_8.append("g27nptRUUUzP9rjlPzU9f/HiFog/7QrXJRGa+BEpwY5DBEnnofahnyWCdG+s");
strBuf_8.append("ESFY2P/ovU3PrLbcSjpysIheeTerEkkXNQzd8UtAhs+NW4h6lRofDjfSb47S");
strBuf_8.append("Ahiqfp3b7ENAmLY6Wsjf8uuEXyqghC8YxvYS8BzuQDO6MHtCdiSNr0HTgvTj");
strBuf_8.append("sF2wR9MoWDLVcRwWKLgoy0FVtvqD4RRFbEHtnjDscBXA8FGXrkQ5MYu+1IS8");
strBuf_8.append("eMhlghLatzqFL2FR4iulC+VSU7NJ4RQmOoIMbP~-1~-1~-1,38158,-1,-1,");
strBuf_8.append("30261693,PiZtE,34615,35,14,true-1,2,-94,-106,0,0-1,2,-94,-11");
strBuf_8.append("9,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-");
strBuf_8.append("1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-70,-1-1,2,-94,-80,94-1");
strBuf_8.append(",2,-94,-116,4072848-1,2,-94,-118,142059-1,2,-94,-129,-1,2,-9");
strBuf_8.append("4,-121,;5;-1;0\"}");
String requestData_8 = strBuf_8.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1ECFBB4C421D780E519B06161363232", postData, requestData_8, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_9 = new StringBuffer();
strBuf_9.append("id=7d9f2add-a0a5-4bfb-9ca9-9401e1d819e7&tagId=11024&fullRefe");
strBuf_9.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fcatalog%2Fsearch");
strBuf_9.append(".do%3FNtt%3Dstapler&payload=%7B%22sitePage%22%3A%7B%22enterp");
strBuf_9.append("riseId%22%3A%221523082%22%2C%22cartSubtotal%22%3A%220%22%2C%");
strBuf_9.append("22trackingSource%22%3A%22gtm%22%2C%22pageType%22%3A%22N%2FA%");
strBuf_9.append("22%2C%22%22%3A%7B%22userId%22%3A%22%22%2C%22emailHash%22%3A%");
strBuf_9.append("22%22%2C%22marketing_channel%22%3A%22In%20Progress%22%7D%7D%");
strBuf_9.append("7D&isDeviceAccessGranted=false&cjUser=00000000-0000-0000-000");
strBuf_9.append("0-000000000000&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_9 = strBuf_9.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1ECFBB4C45A4CFCE519B06161363232", postData, requestData_9, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_8);

	}

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_10(postData);
				
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
	private void postDataClass_10(HTTPPostData postData) {
				StringBuffer strBuf_10 = new StringBuffer();
strBuf_10.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_10.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_10.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_10.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_10.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_10.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.31376637");
strBuf_10.append("8156,828475678817.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_10.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_10.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_10.append("-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_10.append(",310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,124");
strBuf_10.append("0,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,124");
strBuf_10.append("3,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,124");
strBuf_10.append("6,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,124");
strBuf_10.append("9,2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_10.append("1,2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,129");
strBuf_10.append("4,2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,129");
strBuf_10.append("7,2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_10.append("1,2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,0,0,0,-1,310,1;");
strBuf_10.append("0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,0,1057,1057,0;0,-");
strBuf_10.append("1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0,0,1241,2007,0;0,");
strBuf_10.append("2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0,0,1244,2010,0;0,");
strBuf_10.append("2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0,0,1247,2013,0;0,");
strBuf_10.append("2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0,0,1289,2055,0;0,");
strBuf_10.append("2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1292,2058,0;0,");
strBuf_10.append("2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,0,1295,2061,0;0,");
strBuf_10.append("2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,0,1298,2064,0;0,");
strBuf_10.append("2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1293,2059,0;-1");
strBuf_10.append(",2,-94,-108,-1,2,-94,-110,0,1,944,699,214;1,1,952,698,222;2,");
strBuf_10.append("1,974,698,231;3,1,999,697,243;-1,2,-94,-117,-1,2,-94,-111,0,");
strBuf_10.append("1002,-1,-1,-1;-1,2,-94,-109,0,1002,-1,-1,-1,-1,-1,-1,-1,-1,-");
strBuf_10.append("1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://www.offi");
strBuf_10.append("cedepot.com/catalog/search.do?Ntt=stapler-1,2,-94,-115,1,761");
strBuf_10.append("3,32,1002,1002,0,9585,1022,0,1656951357635,19,17725,0,4,2954");
strBuf_10.append(",0,0,1026,5873,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4P");
strBuf_10.append("XF6r/DbeBAQAAsUH/yQjGR0I75IC8Ilb37UvS29n+MLk5aNT+EJewMfLhMXD");
strBuf_10.append("9sCeUhTobIY8IDhl9Ggg/2O8D5pfCac1iVMgfV7BdCNZWng/QV4KsAcAhevP");
strBuf_10.append("7iMe1UOgQYyy4JAKsZQ1/Rk24JSXbrvPMezY7FrEQiuLcqTtn/3Z8s6WUWpo");
strBuf_10.append("rAVRfb1dHwTwoVAwmiRUUVPrEWnS+E+O3skTwI3yT/BA51veaQkbvgBH8Gah");
strBuf_10.append("HUeFzABjgkGH2WJAG9McJy8LQP9Moow1EHQlzo8wakTyHwb/XY6LTr1Cveji");
strBuf_10.append("LDd3KzL+um1rdk8OVITr7RGfPJ6iq/LuqTDK/xHcOZjTcNHMkUcketW01qp6");
strBuf_10.append("HGBr59Xp998eWkxVvd5fc7T9LcZsVoAUxycI3~-1~-1~-1,36901,143,688");
strBuf_10.append("859606,30261693,PiZtE,42316,67,14,true-1,2,-94,-106,9,1-1,2,");
strBuf_10.append("-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94");
strBuf_10.append(",-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322243122-1,2,-");
strBuf_10.append("94,-70,273720021;-851345892;dis;,7;true;true;true;-60;true;2");
strBuf_10.append("4;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116,4072848-1,2");
strBuf_10.append(",-94,-118,156521-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;7;11;0\"");
strBuf_10.append("}");
String requestData_10 = strBuf_10.toString();
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1ECFBB4C45AE8E0E519B06161363232", postData, requestData_10, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_9);

	}

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_11(postData);
				
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
	private void postDataClass_11(HTTPPostData postData) {
				StringBuffer strBuf_11 = new StringBuffer();
strBuf_11.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_11.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_11.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_11.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_11.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_11.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.77592804");
strBuf_11.append("0387,828475678817.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_11.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_11.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_11.append("-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_11.append(",310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,124");
strBuf_11.append("0,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,124");
strBuf_11.append("3,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,124");
strBuf_11.append("6,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,124");
strBuf_11.append("9,2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_11.append("1,2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,129");
strBuf_11.append("4,2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,129");
strBuf_11.append("7,2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,129");
strBuf_11.append("1,2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,-1,0,0,-1,-1,0;");
strBuf_11.append("0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,");
strBuf_11.append("0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0");
strBuf_11.append(",0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0");
strBuf_11.append(",0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0");
strBuf_11.append(",0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0");
strBuf_11.append(",0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0");
strBuf_11.append(",0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0");
strBuf_11.append(",0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0");
strBuf_11.append(",0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0");
strBuf_11.append(",0,1293,2059,0;-1,2,-94,-108,-1,2,-94,-110,0,1,944,699,214;1");
strBuf_11.append(",1,952,698,222;2,1,974,698,231;3,1,999,697,243;4,1,2232,570,");
strBuf_11.append("757;5,1,3638,1052,433;6,1,3910,1054,414;7,1,3954,1054,413;8,");
strBuf_11.append("1,4297,1054,411;9,3,4416,1054,411,-1;-1,2,-94,-117,-1,2,-94,");
strBuf_11.append("-111,0,1002,-1,-1,-1;-1,2,-94,-109,0,1002,-1,-1,-1,-1,-1,-1,");
strBuf_11.append("-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://w");
strBuf_11.append("ww.officedepot.com/catalog/search.do?Ntt=stapler-1,2,-94,-11");
strBuf_11.append("5,1,38784,32,1002,1002,0,40756,4416,0,1656951357635,19,17725");
strBuf_11.append(",0,10,2954,1,0,4418,28320,0,6477B517AA19C8A6D24FA64BF87FBEC1");
strBuf_11.append("~-1~YAAQb4PXF83/DbeBAQAAckX/yQhKDw68/PauogqblvsE9cpNSbbsL5hq");
strBuf_11.append("X5/8Gxl7619Fl5VzuAyFXbk3Tkq6njRN9x8jSwHQzPWsHtUwGpZ/Wq+vqfFo");
strBuf_11.append("Cn8LTwYJ9z+8FxUqgJ+7NSFzQiBHBkvHE86dXQNQZGwPs9s42IVe5LxPFt/q");
strBuf_11.append("xocnD2qwV3u+pg+43m4r1edZ0Fftyq0u4QA0l7dF1/WPprpM8WX7cSUFC2Ip");
strBuf_11.append("utlTJuf99fBDfZ22XRpfZGBHNTIlZGekZJwHSpcCLlCUN5tvTUbBD++WfCeN");
strBuf_11.append("CdvSL6ZD5DspAIdjJayhuCMNAmUJmZEcz2PgZF25YlyYVjtn0JAATpSPcA8X");
strBuf_11.append("evPOrvcvlZoanA8K+iaTPwl3VtyLK4cd8+5T/Cb6WEiIl4rs~-1~-1~-1,37");
strBuf_11.append("191,143,688859606,30261693,PiZtE,106922,65,14,true-1,2,-94,-");
strBuf_11.append("106,1,2-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-");
strBuf_11.append("123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322");
strBuf_11.append("243122-1,2,-94,-70,273720021;-851345892;dis;,7;true;true;tru");
strBuf_11.append("e;-60;true;24;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116");
strBuf_11.append(",4072848-1,2,-94,-118,163374-1,2,-94,-129,,,769baa1e58c97f68");
strBuf_11.append("e09ccec638eeebbd00639644b5049f8a3ec95a8672a5b0cb,,,,0-1,2,-9");
strBuf_11.append("4,-121,;3;11;0\"}");
String requestData_11 = strBuf_11.toString();
			
	HTTPPostDataChunk pdc_10 = new HTTPPostDataChunk("A1ECFBB4C45B8571E519B06161363232", postData, requestData_11, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_10);

	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(1705, 1, parent, parent, "A1ECFBB4C62548A9E519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Stapler Results", "A1ECFBB4C62548A9E519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_87(this, true, "A1ECFBB4C62548A1E519B06161363232", true, false,
						"Config_3", "/en_US_od_business_accelerator_search.xml",	"/en_US_od_business_accelerator_search.xml", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_88(this, false, "A1ECFBB4C62596C1E519B06161363232", false, false,
						"Config_4", "/favicon.ico?v=1.1",	"/favicon.ico?v=1.1", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_89(this, false, "A1ECFBB4C625E4E3E519B06161363232", true, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 60, 100, "A1ECFBB4C62548ADE519B06161363232", 3);
				httpParallel.addRequest(1, request_90(this, false, "A1ECFBB4C62596C1E519B06161363232", true, false,
						"Config_4", "/en_US_od_business_accelerator_search.xml",	"/en_US_od_business_accelerator_search.xml", true, false), 54, 100, "A1ECFBB4C62596CFE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_12(postData);
				
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
	private void postDataClass_12(HTTPPostData postData) {
				StringBuffer strBuf_12 = new StringBuffer();
strBuf_12.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_12.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_12.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_12.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1357636,2560,1401,25");
strBuf_12.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_12.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.12856477");
strBuf_12.append("264,828475678817.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_12.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_12.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_12.append("1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,");
strBuf_12.append("310,1;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240");
strBuf_12.append(",2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243");
strBuf_12.append(",2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246");
strBuf_12.append(",2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249");
strBuf_12.append(",2015,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291");
strBuf_12.append(",2057,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294");
strBuf_12.append(",2060,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297");
strBuf_12.append(",2063,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291");
strBuf_12.append(",2057,0;0,2,0,0,1293,2059,0;-1,2,-94,-102,0,-1,0,0,-1,-1,0;0");
strBuf_12.append(",0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,1;0,-1,0,0");
strBuf_12.append(",1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2006,0;0,2,0,");
strBuf_12.append("0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2009,0;0,2,0,");
strBuf_12.append("0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2012,0;0,2,0,");
strBuf_12.append("0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1249,2015,0;0,2,0,");
strBuf_12.append("0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,");
strBuf_12.append("0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,");
strBuf_12.append("0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,");
strBuf_12.append("0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,");
strBuf_12.append("0,1293,2059,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_12.append("0,-1,622,0;-1,-1,1,0,-1,706,0;-1,-1,1,0,-1,317,0;-1,-1,1,0,-");
strBuf_12.append("1,219,0;-1,-1,1,0,-1,220,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,2");
strBuf_12.append("16,0;-1,-1,1,0,-1,118,0;-1,-1,1,0,-1,214,0;-1,-1,1,0,-1,427,");
strBuf_12.append("0;-1,-1,1,0,-1,418,0;-1,-1,1,0,-1,421,0;-1,-1,1,0,-1,511,0;-");
strBuf_12.append("1,-1,1,0,-1,632,0;-1,-1,1,0,-1,424,0;-1,-1,1,0,-1,434,0;-1,-");
strBuf_12.append("1,1,0,-1,360,0;-1,-1,1,0,-1,629,0;-1,-1,1,0,-1,622,0;-1,2,-9");
strBuf_12.append("4,-108,-1,2,-94,-110,0,1,944,699,214;1,1,952,698,222;2,1,974");
strBuf_12.append(",698,231;3,1,999,697,243;4,1,2232,570,757;5,1,3638,1052,433;");
strBuf_12.append("6,1,3910,1054,414;7,1,3954,1054,413;8,1,4297,1054,411;9,3,44");
strBuf_12.append("16,1054,411,-1;10,4,4650,1054,411,-1;11,2,5461,1054,411,-1;1");
strBuf_12.append("2,1,5492,364,758;13,1,6533,363,757;14,3,7384,363,757,-1;-1,2");
strBuf_12.append(",-94,-117,-1,2,-94,-111,0,1002,-1,-1,-1;-1,2,-94,-109,0,1002");
strBuf_12.append(",-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2");
strBuf_12.append(",-94,-112,https://www.officedepot.com/catalog/search.do?Ntt=");
strBuf_12.append("stapler-1,2,-94,-115,1,74667,32,1002,1002,0,76639,7384,0,165");
strBuf_12.append("6951357635,19,17725,0,15,2954,3,0,7394,57840,0,6477B517AA19C");
strBuf_12.append("8A6D24FA64BF87FBEC1~-1~YAAQb4PXF3MADreBAQAATlP/yQjG1ZMjexmtP");
strBuf_12.append("aMwjUaN30hllL7ygCtic/SOZvS+trtgnDUHS/U8gpJYXo8nu2sZNPb9QnJvp");
strBuf_12.append("lVk/xNCOIrDcYKpHcvxgDKAxA/27oLLcEm1Yg7SCxDxCVhSLpAtFYcBsFTGd");
strBuf_12.append("Z6c9W7YegCwuaMxk9vFO1vtfK/4L1yhm7nY3q96Mz1lDV1g9rJfdOCDNhpR8");
strBuf_12.append("MHwMo9lYLc24wBfLUq4IJRWE5PXegALZcpAji2L+ZcMJr7KUkix7Oa3uJEl/");
strBuf_12.append("E4ySjylvmO663wBcKQyvEnhDfYW8rDp9qz5tiOoBZz1qbMWS85guxb0YXpN+");
strBuf_12.append("Xc6rCfp3vZaBI6VQ28+1q0kKzkcth3ztizb74LFx/SnKugt5TRR8+dlIOorX");
strBuf_12.append("uWkobWF~-1~-1~-1,37659,143,688859606,30261693,PiZtE,86494,58");
strBuf_12.append(",14,true-1,2,-94,-106,1,3-1,2,-94,-119,-1-1,2,-94,-122,0,0,1");
strBuf_12.append(",0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-");
strBuf_12.append("127,21321144241322243122-1,2,-94,-70,273720021;-851345892;di");
strBuf_12.append("s;,7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80");
strBuf_12.append(",5372-1,2,-94,-116,4072848-1,2,-94,-118,187871-1,2,-94,-129,");
strBuf_12.append("479507b7234c45186c995a034296add61e679bb70e95994997a64c22e9b0");
strBuf_12.append("d79c,1.5,769baa1e58c97f68e09ccec638eeebbd00639644b5049f8a3ec");
strBuf_12.append("95a8672a5b0cb,Google Inc. (Intel),ANGLE (Intel, Intel(R) UHD");
strBuf_12.append(" Graphics 630 Direct3D11 vs_5_0 ps_5_0, D3D11),95f5b71fe531f");
strBuf_12.append("867faa814bdd4050dd8057206d53ecec1163523560525884870,33-1,2,-");
strBuf_12.append("94,-121,;12;11;0\"}");
String requestData_12 = strBuf_12.toString();
			
	HTTPPostDataChunk pdc_11 = new HTTPPostDataChunk("A1ECFBB4C6260C04E519B06161363232", postData, requestData_12, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_11);

	}

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
private HTTPPage page_6(final IContainer parent) {
			HTTPThink think = new HTTPThink(1125, 1, parent, parent, "A1ECFBB4C8270C1FE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Bostitch Stapler", "A1ECFBB4C8270C1FE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(9, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_91(this, true, "A1ECFBB4C8270C11E519B06161363232", true, true,
						"Config_4", "/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/",	"/a/products/551703/Bostitch-InPower-Premium-Spring-Powered-Desktop/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_92(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/styles/od/skupage_override.min.f590116861.css",	"/styles/od/skupage_override.min.f590116861.css", true, false), 768, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_93(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/styles/sku_page.min.8e07d499ef3a3aa156dc.css",	"/styles/sku_page.min.8e07d499ef3a3aa156dc.css", true, false), 773, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(3, request_94(this, false, "A1ECFBB4C85288E0E519B06161363232", true, false,
						"Config_4", "/js/global_resources.min.af094a968357d28d3e0b.js",	"/js/global_resources.min.af094a968357d28d3e0b.js", true, false), 769, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(4, request_95(this, false, "A1ECFBB4C8537342E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 770, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(5, request_96(this, false, "A1ECFBB4C853C1A5E519B06161363232", true, false,
						"Config_4", "/js/conversant.min.053f8dfab1eb9d5f68a8.js",	"/js/conversant.min.053f8dfab1eb9d5f68a8.js", true, false), 770, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(1, request_97(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/js/global_recently_viewed.min.7c8fe75a73271abbe4e8.js",	"/js/global_recently_viewed.min.7c8fe75a73271abbe4e8.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_98(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/js/rich_relevance.min.033455e584a16ab6476c.js",	"/js/rich_relevance.min.033455e584a16ab6476c.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_99(this, false, "A1ECFBB4C8537342E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=6&cachebuster=1048859727",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=6&cachebuster=1048859727", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_100(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 1751, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_101(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 2274, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_102(this, false, "A1ECFBB4C8289303E519B06161363232", false, false,
						"Config_4", "/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703",	"/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703", true, false), 3491, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(4, request_103(this, false, "A1ECFBB4C8537342E519B06161363232", true, false,
						"Config_4", "/json/translations.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?keys=atc.warranty.lightbox.heading,atc.warranty.lightbox.sub.heading,atc.warranty.lightbox.customer.benefits,atc.warranty.lightbox.customer.shipping,atc.warranty.lightbox.customer.support,atc.warranty.lightbox.smartphone.protection,atc.warranty.lightbox.customer.smart.device.service,atc.warranty.lightbox.customer.nohidden.fees,atc.warranty.lightbox.btn1,atc.warranty.lightbox.continueshooping,atc.warranty.lightbox.addtocart,atc.common.continue.to.cart,atc.warranty.continue.cart,atc.warranty.lightbox.add.protection.plan,atc.warranty.lightbox.laptop.subheading,atc.warranty.lightbox.laptop.subheading.protection,atc.warranty.lightbox.smarttv.gear.heading,atc.warranty.covers.mechanical.electrical.failures,atc.warranty.lightbox.covers.wifi.failures,atc.warranty.lightbox.gear.support,atc.warranty.lightbox.ipad.support,atc.warranty.lightbox.ipad.support.touchscreen,atc.warranty.lightbox.furniture.main.heading,atc.warranty.lightbox.gouges,atc.warranty.lightbox.furniture.hardware.failures,intro",	"/json/translations.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?keys=atc.warranty.lightbox.heading,atc.warranty.lightbox.sub.heading,atc.warranty.lightbox.customer.benefits,atc.warranty.lightbox.customer.shipping,atc.warranty.lightbox.customer.support,atc.warranty.lightbox.smartphone.protection,atc.warranty.lightbox.customer.smart.device.service,atc.warranty.lightbox.customer.nohidden.fees,atc.warranty.lightbox.btn1,atc.warranty.lightbox.continueshooping,atc.warranty.lightbox.addtocart,atc.common.continue.to.cart,atc.warranty.continue.cart,atc.warranty.lightbox.add.protection.plan,atc.warranty.lightbox.laptop.subheading,atc.warranty.lightbox.laptop.subheading.protection,atc.warranty.lightbox.smarttv.gear.heading,atc.warranty.covers.mechanical.electrical.failures,atc.warranty.lightbox.covers.wifi.failures,atc.warranty.lightbox.gear.support,atc.warranty.lightbox.ipad.support,atc.warranty.lightbox.ipad.support.touchscreen,atc.warranty.lightbox.furniture.main.heading,atc.warranty.lightbox.gouges,atc.warranty.lightbox.furniture.hardware.failures,intro", true, false), 3493, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(6, request_104(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 3498, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(1, request_105(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/mobile/getSkuAvailableOptions.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?familyDescription=Bostitch%20%20InPower&trade;%20Premium%20Spring-Powered%20Desktop%20Stapler&sku=551703",	"/mobile/getSkuAvailableOptions.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?familyDescription=Bostitch%20%20InPower&trade;%20Premium%20Spring-Powered%20Desktop%20Stapler&sku=551703", true, false), 3509, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(2, request_106(this, false, "A1ECFBB4C8289303E519B06161363232", true, false,
						"Config_4", "/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703",	"/catalog/crosssellsAndPPP.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?sku=551703", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_107(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 4247, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(7, request_108(this, false, "A1ECFBB4C857B907E519B06161363232", false, false,
						"Config_5", "/services/store-locator-service/stores/v1/91",	"/services/store-locator-service/stores/v1/91", true, false), 1105, 100, "A1ECFBB4C855E49CE519B06161363232", 3);
				httpParallel.addRequest(7, request_109(this, false, "A1ECFBB4C857B907E519B06161363232", true, false,
						"Config_5", "/services/store-locator-service/stores/v1/91",	"/services/store-locator-service/stores/v1/91", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_110(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703,203349,432255&mapBySkuId=true&showRestricted=true&noSession=true&pr=",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703,203349,432255&mapBySkuId=true&showRestricted=true&noSession=true&pr=", true, false), 5231, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(1, request_111(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=923328,475166,758877&mapBySkuId=true&showRestricted=true&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=923328,475166,758877&mapBySkuId=true&showRestricted=true&noSession=true", true, false), 5700, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(8, request_112(this, false, "A1ECFBB4C8587CAEE519B06161363232", false, false,
						"Config_5", "/services/cross-sell-service/csModel",	"/services/cross-sell-service/csModel", true, false), 351, 100, "A1ECFBB4C857E010E519B06161363232", 3);
				httpParallel.addRequest(1, request_113(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 6126, 100, "A1ECFBB4C8270C23E519B06161363232", 2);
				httpParallel.addRequest(8, request_114(this, false, "A1ECFBB4C8587CAEE519B06161363232", true, false,
						"Config_5", "/services/cross-sell-service/csModel",	"/services/cross-sell-service/csModel", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_99(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_100(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_13(postData);
				
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
	private void postDataClass_13(HTTPPostData postData) {
				StringBuffer strBuf_13 = new StringBuffer();
strBuf_13.append("id=82c02072-5a91-423f-a420-106a4b11b197&tagId=11024&fullRefe");
strBuf_13.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fa%2Fproducts%2F5");
strBuf_13.append("51703%2FBostitch-InPower-Premium-Spring-Powered-Desktop%2F&p");
strBuf_13.append("ayload=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%22152308");
strBuf_13.append("2%22%2C%22cartSubtotal%22%3A%220%22%2C%22trackingSource%22%3");
strBuf_13.append("A%22gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22%22%3A%7B%22u");
strBuf_13.append("serId%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C%22marketing_");
strBuf_13.append("channel%22%3A%22In%20Progress%22%7D%7D%7D&isDeviceAccessGran");
strBuf_13.append("ted=false&cjUser=00000000-0000-0000-0000-000000000000&cookie");
strBuf_13.append("s=cjConsent%3DMHxZfDB8Tnww");
String requestData_13 = strBuf_13.toString();
			
	HTTPPostDataChunk pdc_12 = new HTTPPostDataChunk("A1ECFBB4C855E440E519B06161363232", postData, requestData_13, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_12);

	}

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_14(postData);
				
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
	private void postDataClass_14(HTTPPostData postData) {
				StringBuffer strBuf_14 = new StringBuffer();
strBuf_14.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_14.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_14.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_14.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1370395,2560,1401,25");
strBuf_14.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_14.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.00976076");
strBuf_14.append("94,828475685197.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,dm");
strBuf_14.append("_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,");
strBuf_14.append("0,0,0,-1,310,0;0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-9");
strBuf_14.append("4,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,0;");
strBuf_14.append("0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-94,-108,-1,2,-94");
strBuf_14.append(",-110,-1,2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-11");
strBuf_14.append("4,-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/a/");
strBuf_14.append("products/551703/Bostitch-InPower-Premium-Spring-Powered-Desk");
strBuf_14.append("top/-1,2,-94,-115,1,32,32,0,0,0,0,2,0,1656951370395,-999999,");
strBuf_14.append("17725,0,0,2954,0,0,4,0,0,6477B517AA19C8A6D24FA64BF87FBEC1~-1");
strBuf_14.append("~YAAQb4PXF9sADreBAQAAxl7/yQgZKyc+tF1uk9mvUs4rmJWGItjrTsHY0yj");
strBuf_14.append("ldRyPOZXItvjmTiv40GqARaxNfS7ji/D2BbN7esn5ud6sUNNEt4BGW1pM3gG");
strBuf_14.append("0+KSHIpB0ucJxL1oXgzvVm3mntf8Efz5wZ1sTIS5IcNluHNi1ix6Ylo80u6y");
strBuf_14.append("qe9/AFj4mFsCW475rk+EozhqSKc9sNLKBFvT01cr0tprnan4rZl5UHb+yhAS");
strBuf_14.append("QiHG2wyOLrCWsQtFhk0Q7F1DDUBM4Jey0tDoECqaLfKEoNrG14ud2sDajZyj");
strBuf_14.append("OePxbq6nmopkBmO0aniALulKAx1tsxRUW9/aBLSTdxQPVZRGP5RSYIe0mKUj");
strBuf_14.append("YoFEfIR2s4EPykfQSwP4PgULU4XodmlNxJkjTMg3JVZsk~-1~-1~-1,37842");
strBuf_14.append(",-1,-1,30261693,PiZtE,21081,107,14,true-1,2,-94,-106,0,0-1,2");
strBuf_14.append(",-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-9");
strBuf_14.append("4,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-70,-1-1,2,-94,");
strBuf_14.append("-80,94-1,2,-94,-116,4111197-1,2,-94,-118,99703-1,2,-94,-129,");
strBuf_14.append("-1,2,-94,-121,;10;-1;0\"}");
String requestData_14 = strBuf_14.toString();
			
	HTTPPostDataChunk pdc_13 = new HTTPPostDataChunk("A1ECFBB4C8560BADE519B06161363232", postData, requestData_14, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_13);

	}

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_107(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_15(postData);
				
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
	private void postDataClass_15(HTTPPostData postData) {
				StringBuffer strBuf_15 = new StringBuffer();
strBuf_15.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_15.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_15.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_15.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1370395,2560,1401,25");
strBuf_15.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_15.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.68058955");
strBuf_15.append("3340,828475685197.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_15.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_15.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_15.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_15.append(",310,0;0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-94,-102,0");
strBuf_15.append(",0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,0;0,-1,0,0");
strBuf_15.append(",1036,-1,1;-1,2,-94,-108,-1,2,-94,-110,0,1,1646,404,457;1,1,");
strBuf_15.append("1757,653,418;2,1,1941,839,317;-1,2,-94,-117,-1,2,-94,-111,-1");
strBuf_15.append(",2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https:");
strBuf_15.append("//www.officedepot.com/a/products/551703/Bostitch-InPower-Pre");
strBuf_15.append("mium-Spring-Powered-Desktop/-1,2,-94,-115,1,8470,32,0,0,0,84");
strBuf_15.append("38,1980,0,1656951370395,28,17725,0,3,2954,0,0,1982,5344,0,64");
strBuf_15.append("77B517AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4PXF1YCDreBAQAAu3n/yQ");
strBuf_15.append("idkFlbDCEuT8zKdzFt8fLuWysq900NYtEyv+pOSgwY4MUAR59pD+h8NDlEkl");
strBuf_15.append("pBPSRG8aNfnPsWeSu0IDwo8LooskbMI3VYWL7VrLPEmIZC/Db0kk5WG39eSK");
strBuf_15.append("iBb4BvZK529SWtjpPdK2R/WoSyYX7Xsud4aW+K80SFwDnAAJMIr7VSCCzxD2");
strBuf_15.append("mg7YbDx+nOIcNacIi1NhVqhM0w/ryJ3EbaAaOcXfiogDbgFjIQoYTWqe338p");
strBuf_15.append("kGAJPn3jsyWlKuZIU/90R1ngypG/EcMrfTh1PJfbihVqkyOPmNYm7Bi1qOFS");
strBuf_15.append("i7y43Zj4RIV5OO9vAfB6stXT2T2ygdItiX6np3FbDvDeAHYgzTcEyTllrTyj");
strBuf_15.append("0sEhq7vWUtFaOXF0Hb~-1~-1~-1,37346,143,688859606,30261693,PiZ");
strBuf_15.append("tE,17097,40,14,true-1,2,-94,-106,9,1-1,2,-94,-119,-1-1,2,-94");
strBuf_15.append(",-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126");
strBuf_15.append(",-1,2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;-8");
strBuf_15.append("51345892;dis;,7;true;true;true;-60;true;24;24;true;false;-1-");
strBuf_15.append("1,2,-94,-80,5372-1,2,-94,-116,4111197-1,2,-94,-118,110779-1,");
strBuf_15.append("2,-94,-129,,,0,,,,0-1,2,-94,-121,;4;15;0\"}");
String requestData_15 = strBuf_15.toString();
			
	HTTPPostDataChunk pdc_14 = new HTTPPostDataChunk("A1ECFBB4C85791FAE519B06161363232", postData, requestData_15, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_14);

	}

	public HTTPAction request_108(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_109(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_110(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_111(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_112(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_113(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_16(postData);
				
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
	private void postDataClass_16(HTTPPostData postData) {
				StringBuffer strBuf_16 = new StringBuffer();
strBuf_16.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_16.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_16.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_16.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1370395,2560,1401,25");
strBuf_16.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_16.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.17245196");
strBuf_16.append("886,828475685197.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_16.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_16.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_16.append("1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,");
strBuf_16.append("310,0;0,-1,0,0,1036,-1,1;0,-1,0,0,1036,-1,1;-1,2,-94,-102,0,");
strBuf_16.append("0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,310,0;0,-1,0,0,");
strBuf_16.append("1036,-1,1;-1,2,-94,-108,-1,2,-94,-110,0,1,1646,404,457;1,1,1");
strBuf_16.append("757,653,418;2,1,1941,839,317;3,1,2057,912,277;4,1,2183,1000,");
strBuf_16.append("249;5,1,2320,1085,233;6,1,2532,1100,231;7,1,2712,1098,237;8,");
strBuf_16.append("1,2825,1094,246;9,1,2933,1093,247;10,1,3447,1080,277;11,3,38");
strBuf_16.append("63,1080,277,-1;-1,2,-94,-117,-1,2,-94,-111,0,2346,-1,-1,-1;-");
strBuf_16.append("1,2,-94,-109,0,2346,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114");
strBuf_16.append(",-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/a/p");
strBuf_16.append("roducts/551703/Bostitch-InPower-Premium-Spring-Powered-Deskt");
strBuf_16.append("op/-1,2,-94,-115,1,45232,32,2346,2346,0,49892,3863,0,1656951");
strBuf_16.append("370395,28,17725,0,12,2954,1,0,3864,34908,0,6477B517AA19C8A6D");
strBuf_16.append("24FA64BF87FBEC1~-1~YAAQb4PXF2gCDreBAQAAaXv/yQiwnpa6isKoABpDl");
strBuf_16.append("aQ2p8twlwEVHjDRY8LFz+5YVleuP44OiYDTIuqR7UlUZM2avUGheNkqoEFr6");
strBuf_16.append("4YD9M3Negz5DscLjd1NlsDftdQ5kPUm0kL2D0xK+T2/okqlg2FK2mHCipkwv");
strBuf_16.append("2M0QNjNhiEDYQRcYDdiL1L/yHHWSXVLO9oGojUC+Q8jJEdL7+YwqVF+JRSWz");
strBuf_16.append("Um1yYVZukvU4J9QhzG2v6+2Bj7iZCpwVJ807GAQfYPJadlR45fPBwNXBuUc5");
strBuf_16.append("FzvFeAyr7RE8P0lgMg0u1qUK/FCdFgv9uCkDrgMTcvRbMXpTk+S0WXS3TQsx");
strBuf_16.append("7HhihL+/O+jTaId+0ZL5d2CUBRm8S/0dt0BbKWrtQN1ulUisfSWO7cuU9NLD");
strBuf_16.append("gl2~-1~-1~-1,36782,143,688859606,30261693,PiZtE,20912,102,14");
strBuf_16.append(",true-1,2,-94,-106,1,2-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,");
strBuf_16.append("1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127");
strBuf_16.append(",21321144241322243122-1,2,-94,-70,273720021;-851345892;dis;,");
strBuf_16.append("7;true;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80,53");
strBuf_16.append("72-1,2,-94,-116,4111197-1,2,-94,-118,121395-1,2,-94,-129,,,7");
strBuf_16.append("69baa1e58c97f68e09ccec638eeebbd00639644b5049f8a3ec95a8672a5b");
strBuf_16.append("0cb,,,,0-1,2,-94,-121,;3;15;0\"}");
String requestData_16 = strBuf_16.toString();
			
	HTTPPostDataChunk pdc_15 = new HTTPPostDataChunk("A1ECFBB4C85BD7B0E519B06161363232", postData, requestData_16, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_15);

	}

	public HTTPAction request_114(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_17(postData);
				
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
	private void postDataClass_17(HTTPPostData postData) {
				StringBuffer strBuf_17 = new StringBuffer();
strBuf_17.append("{\n  \"session_id\": \"0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd\",\n ");
strBuf_17.append(" \"cookie_id\": \"12345\",\n  \"current_cat\": \"Reduced Effort \\u00");
strBuf_17.append("26 Basic Staplers\",\n  \"current_sku\": \"551703\",\n  \"viewed_cat");
strBuf_17.append("\": []\n}");
String requestData_17 = strBuf_17.toString();
			
	HTTPPostDataChunk pdc_16 = new HTTPPostDataChunk("A1ECFBB4C85BFF06E519B06161363232", postData, requestData_17, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_16);

	}
private HTTPPage page_7(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4C8D17CE0E519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Add To Cart", "A1ECFBB4C8D17CE0E519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_115(this, true, "A1ECFBB4C1F0EDC0E519B06161363232", false, true,
						"Config_4", "/ajaxhtml/addSkuToCartByButton.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?cmd_addSKU.button.INDEX[0]=Add%2520to%2520Cart",	"/ajaxhtml/addSkuToCartByButton.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?cmd_addSKU.button.INDEX[0]=Add%2520to%2520Cart", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_116(this, false, "A1ECFBB4C8286BA0E519B06161363232", false, false,
						"Config_4", "/fm/files/od/testing/2019/couponicon.png",	"/fm/files/od/testing/2019/couponicon.png", true, false), 214, 100, "A1ECFBB4C8D17CE4E519B06161363232", 3);
				httpParallel.addRequest(2, request_117(this, false, "A1ECFBB4C8D21920E519B06161363232", false, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=420994,664011,336977,255876,514228,295825,837398,479608,442306,161636&mapBySkuId=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=420994,664011,336977,255876,514228,295825,837398,479608,442306,161636&mapBySkuId=true", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_118(this, false, "A1ECFBB4C8286BA0E519B06161363232", true, false,
						"Config_4", "/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_119(this, false, "A1ECFBB4C8D21920E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=6577047,8700486,8357591,9652256,8467734,8812004,8971046,9584688,8778165,258901,593247,7147958,141981,479596,938678,490486,108185,4799412,139179,239384,7890125,141747,239400,2708301&&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=6577047,8700486,8357591,9652256,8467734,8812004,8971046,9584688,8778165,258901,593247,7147958,141981,479596,938678,490486,108185,4799412,139179,239384,7890125,141747,239400,2708301&&noSession=true", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_120(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", false, false,
						"Config_4", "/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/ajaxhtml/getBsdCartJson.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 5, 100, "A1ECFBB4C8D3C6D0E519B06161363232", 3);
				httpParallel.addRequest(3, request_121(this, false, "A1ECFBB4C8FD95F0E519B06161363232", true, false,
						"Config_4", "/akam-sw.js",	"/akam-sw.js", true, false), 3880, 100, "A1ECFBB4C8FCAB90E519B06161363232", 3);
				httpParallel.addRequest(4, request_122(this, false, "A1ECFBB4C8FE0B20E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 4500, 100, "A1ECFBB4C8FD95FEE519B06161363232", 3);
				httpParallel.addRequest(4, request_123(this, false, "A1ECFBB4C8FE0B20E519B06161363232", true, false,
						"Config_4", "/cart/shoppingCart.do",	"/cart/shoppingCart.do", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_115(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_18(postData);
				
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
	private void postDataClass_18(HTTPPostData postData) {
				StringBuffer strBuf_18 = new StringBuffer();
strBuf_18.append("cmATCSourcePage=Product Details Page&trackingCategoryId=6587");
strBuf_18.append("88&entryFormList[0].cmMessage=Product Details Page&entryForm");
strBuf_18.append("List[0].sku=551703&entryFormList[0].qty=1");
String requestData_18 = strBuf_18.toString();
			
	HTTPPostDataChunk pdc_17 = new HTTPPostDataChunk("A1ECFBB4C8D1A425E519B06161363232", postData, requestData_18, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_17);

	}

	public HTTPAction request_116(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_117(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_118(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_119(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_120(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_121(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_122(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_19(postData);
				
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
	private void postDataClass_19(HTTPPostData postData) {
					String requestData_19 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1ECFBB4C03CAE10E519B06161363232.testdata",
	                                   "A1ECFBB4C8FE323DE519B06161363232",
	                                   4242));
			
	HTTPPostDataChunk pdc_18 = new HTTPPostDataChunk("A1ECFBB4C8FE323DE519B06161363232", postData, requestData_19, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_18);

	}

	public HTTPAction request_123(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
private HTTPPage page_8(final IContainer parent) {
			HTTPThink think = new HTTPThink(174, 1, parent, parent, "A1ECFBB4C9B32A5EE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Shopping Cart", "A1ECFBB4C9B32A5EE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_124(this, true, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/styles/cart_react.min.1b55cc581bebefa9aba6.css",	"/styles/cart_react.min.1b55cc581bebefa9aba6.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_125(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_126(this, false, "A1ECFBB4C1F0EDC0E519B06161363232", true, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 136, 100, "A1ECFBB4C9B32A62E519B06161363232", 3);
				httpParallel.addRequest(0, request_127(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=7&cachebuster=1365547199",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=7&cachebuster=1365547199", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_128(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 364, 100, "A1ECFBB4C9E02E13E519B06161363232", 3);
				httpParallel.addRequest(0, request_129(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/async/cart/getCartInfo.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartInfo.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 183, 100, "A1ECFBB4C9E07BE0E519B06161363232", 3);
				httpParallel.addRequest(2, request_130(this, false, "A1ECFBB4C9E0F17DE519B06161363232", false, false,
						"Config_4", "/async/cart/getCartOrderSummary.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartOrderSummary.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_131(this, false, "A1ECFBB4C9E11893E519B06161363232", true, false,
						"Config_4", "/async/cart/saveForLater/getSkus.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/saveForLater/getSkus.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_132(this, false, "A1ECFBB4C9E0F17DE519B06161363232", false, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_133(this, false, "A1ECFBB4C9E0F17DE519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=332063&mapBySkuId=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=332063&mapBySkuId=true", true, false), 182, 100, "A1ECFBB4C9E1668FE519B06161363232", 3);
				httpParallel.addRequest(0, request_134(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/async/cart/getCartSavingsMessages.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartSavingsMessages.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 200, 100, "A1ECFBB4C9E1668FE519B06161363232", 3);
				httpParallel.addRequest(0, request_135(this, false, "A1ECFBB4C9B32A50E519B06161363232", false, false,
						"Config_4", "/async/cart/getCartCoupons.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd",	"/async/cart/getCartCoupons.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_136(this, false, "A1ECFBB4C9B32A50E519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=801187,348037&mapBySkuId=true&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=801187,348037&mapBySkuId=true&noSession=true", true, false), 257, 100, "A1ECFBB4C9E229EDE519B06161363232", 3);
				httpParallel.addRequest(4, request_137(this, false, "A1ECFBB4C9E29F1DE519B06161363232", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703&mapBySkuId=true&noSession=true",	"/mobile/getAjaxPriceListFromService.do;jsessionid=0000PqPO9z8mfWou2WbTsnvpPDU:1crjkcgcd?items=551703&mapBySkuId=true&noSession=true", true, false), 206, 100, "A1ECFBB4C9E1668FE519B06161363232", 3);
				httpParallel.addRequest(5, request_138(this, false, "A1ECFBB4CA020DA0E519B06161363232", true, false,
						"Config_4", "/cart/checkout.do",	"/cart/checkout.do", true, false), 1942, 100, "A1ECFBB4C9E29F2BE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_124(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_125(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_126(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_20(postData);
				
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
	private void postDataClass_20(HTTPPostData postData) {
				StringBuffer strBuf_19 = new StringBuffer();
strBuf_19.append("id=a7dc10dd-a11d-4a5c-b84e-78ed356c2759&tagId=11024&fullRefe");
strBuf_19.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fcart%2FshoppingC");
strBuf_19.append("art.do&payload=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%");
strBuf_19.append("221523082%22%2C%22cartSubtotal%22%3A%2224.990%22%2C%22tracki");
strBuf_19.append("ngSource%22%3A%22gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22");
strBuf_19.append("%22%3A%7B%22userId%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C");
strBuf_19.append("%22marketing_channel%22%3A%22In%20Progress%22%7D%7D%7D&isDev");
strBuf_19.append("iceAccessGranted=false&cjUser=00000000-0000-0000-0000-000000");
strBuf_19.append("000000&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_20 = strBuf_19.toString();
			
	HTTPPostDataChunk pdc_19 = new HTTPPostDataChunk("A1ECFBB4C9E00718E519B06161363232", postData, requestData_20, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_19);

	}

	public HTTPAction request_127(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_128(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_21(postData);
				
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
	private void postDataClass_21(HTTPPostData postData) {
				StringBuffer strBuf_20 = new StringBuffer();
strBuf_20.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_20.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_20.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_20.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1387440,2560,1401,25");
strBuf_20.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_20.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.92850918");
strBuf_20.append("7464,828475693719.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_20.append("dm_en,t_en-1,2,-94,-105,-1,2,-94,-102,-1,2,-94,-108,-1,2,-94");
strBuf_20.append(",-110,-1,2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-11");
strBuf_20.append("4,-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/ca");
strBuf_20.append("rt/shoppingCart.do-1,2,-94,-115,1,32,32,0,0,0,0,2,0,16569513");
strBuf_20.append("87439,-999999,17725,0,0,2954,0,0,8,0,0,6477B517AA19C8A6D24FA");
strBuf_20.append("64BF87FBEC1~-1~YAAQb4PXF18DDreBAQAAfa3/yQjvHGzJxT8DLIixRCDUJ");
strBuf_20.append("MgltQGx3EjvDR/alalnqZitraX3h2w/acIVnO+lU9OhARfIsj0k2KJ13+BL2");
strBuf_20.append("I2VrNDmXb9E7r8k5BEhxkAOvUoL3rCHX+AstD1krID7Cpb0s86FMK3yNqcwk");
strBuf_20.append("RUOChcCglmjBfLGKY1MXgTrxz/HrRlYmeqwIsz5ncNlL6MwzZpyiMTT37l5D");
strBuf_20.append("cLymjEGo8Y+P4GNLtGLOX2MsI9gXvLCKgZrJ9kWlLuz7ChnoOpiL2QEkgVD9");
strBuf_20.append("/EYTVzgJ96YS4+FLAqcIS185mKhqQw/mQev2IcjbLvoe2O496yXx1wMrKoYC");
strBuf_20.append("ZKYhdGmQmur1dgtvdQmDTsYpCsQEsBXWE3FkYdh6XUW42rJs5rc55D5ZUOk~");
strBuf_20.append("-1~-1~-1,37309,-1,-1,30261693,PiZtE,15073,76,14,true-1,2,-94");
strBuf_20.append(",-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94");
strBuf_20.append(",-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-7");
strBuf_20.append("0,-1-1,2,-94,-80,94-1,2,-94,-116,936521784-1,2,-94,-118,8655");
strBuf_20.append("2-1,2,-94,-129,-1,2,-94,-121,;16;-1;0\"}");
String requestData_21 = strBuf_20.toString();
			
	HTTPPostDataChunk pdc_20 = new HTTPPostDataChunk("A1ECFBB4C9E0A301E519B06161363232", postData, requestData_21, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_20);

	}

	public HTTPAction request_129(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_130(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_131(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_132(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_22(postData);
				
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
	private void postDataClass_22(HTTPPostData postData) {
				StringBuffer strBuf_21 = new StringBuffer();
strBuf_21.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_21.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_21.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_21.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1387440,2560,1401,25");
strBuf_21.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_21.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.89405930");
strBuf_21.append("9447,828475693719.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_21.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_21.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_21.append("-1,2,-94,-105,-1,2,-94,-102,-1,2,-94,-108,-1,2,-94,-110,0,1,");
strBuf_21.append("33,1067,381;1,1,512,1065,381;2,1,620,1064,381;-1,2,-94,-117,");
strBuf_21.append("-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2");
strBuf_21.append(",-94,-112,https://www.officedepot.com/cart/shoppingCart.do-1");
strBuf_21.append(",2,-94,-115,1,5542,32,0,0,0,5510,660,0,1656951387439,33,1772");
strBuf_21.append("5,0,3,2954,0,0,661,1165,0,6477B517AA19C8A6D24FA64BF87FBEC1~-");
strBuf_21.append("1~YAAQb4PXF4QDDreBAQAAO7b/yQh9u9HZYtTkTauGFOF+BrzeX+aNnj4wLM");
strBuf_21.append("jXomXB9YH9DLpzS6XkqOdl/DJ94VXHLgFExKoBtz5DKSBpjqaLTbMGe87a8k");
strBuf_21.append("kfUSrzbOCShaTvfx1rv9KEc3TXagEZ76CfLSs28Jpw3JBF2ZxP935EEMlP+o");
strBuf_21.append("lhZV3lylqJUYOOKUrLMKRly9sG2TdYoKtwa1xMcxqT/UUVwDC+Zp2giJAvwU");
strBuf_21.append("CkPTVbGxvGuNYcCFrfvkphh5WjSRShpDk2e9p6hK85hRnKqEpaCbfDg0S8dh");
strBuf_21.append("SfiedUKCcpJORrauriwnvVVxNCR8W6nhSqmB8NmRJkSX0Fia2pq6hNsu/gmG");
strBuf_21.append("cniyHy+RZOEM9GoTCCSKEfk2q3382QHFa13NdXkeELkXlJ~-1~-1~-1,3762");
strBuf_21.append("9,412,1136889246,30261693,PiZtE,68163,106,14,true-1,2,-94,-1");
strBuf_21.append("06,9,1-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-1");
strBuf_21.append("23,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-70,2");
strBuf_21.append("73720021;-851345892;dis;,7;true;true;true;-60;true;24;24;tru");
strBuf_21.append("e;false;-1-1,2,-94,-80,5372-1,2,-94,-116,936521784-1,2,-94,-");
strBuf_21.append("118,98144-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;4;25;0\"}");
String requestData_22 = strBuf_21.toString();
			
	HTTPPostDataChunk pdc_21 = new HTTPPostDataChunk("A1ECFBB4C9E18D61E519B06161363232", postData, requestData_22, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_21);

	}

	public HTTPAction request_133(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_134(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_135(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_136(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_137(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_138(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
private HTTPPage page_9(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECFBB4CA622F0EE519B06161363232");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Cart Login", "A1ECFBB4CA622F0EE519B06161363232") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_139(this, true, "A1ECFBB4CA622F00E519B06161363232", true, false,
						"Config_4", "/styles/od/account.min.823d86a6f5.css",	"/styles/od/account.min.823d86a6f5.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_140(this, false, "A1ECFBB4CA62A47BE519B06161363232", true, false,
						"Config_4", "/styles/od/checkoutV2Header.min.1d97df3671.css",	"/styles/od/checkoutV2Header.min.1d97df3671.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_141(this, false, "A1ECFBB4CA62CBA7E519B06161363232", true, false,
						"Config_4", "/styles/od/account_integration.min.4051f2f157.css",	"/styles/od/account_integration.min.4051f2f157.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_142(this, false, "A1ECFBB4CA636780E519B06161363232", true, false,
						"Config_4", "/styles/recaptcha_enterprise.min.712177548971d49d8f2f.css",	"/styles/recaptcha_enterprise.min.712177548971d49d8f2f.css", true, false), 104, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(4, request_143(this, false, "A1ECFBB4CA63B5F1E519B06161363232", true, false,
						"Config_4", "/js/od/expRegistration.min.1ec0e3f781.js",	"/js/od/expRegistration.min.1ec0e3f781.js", true, false), 194, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(5, request_144(this, false, "A1ECFBB4CA6403C3E519B06161363232", true, false,
						"Config_4", "/js/od/passwordStrengthMeter.min.9052c56f7c.js",	"/js/od/passwordStrengthMeter.min.9052c56f7c.js", true, false), 185, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(6, request_145(this, false, "A1ECFBB4CA6478F0E519B06161363232", true, false,
						"Config_4", "/js/od/smallbizcheckout.min.085006e460.js",	"/js/od/smallbizcheckout.min.085006e460.js", true, false), 337, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(7, request_146(this, false, "A1ECFBB4CA64A053E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 326, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(8, request_147(this, false, "A1ECFBB4CA651530E519B06161363232", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=99&cachebuster=171948624",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=99&cachebuster=171948624", true, false), 327, 100, "A1ECFBB4CA62F250E519B06161363232", 3);
				httpParallel.addRequest(8, request_148(this, false, "A1ECFBB4CA651530E519B06161363232", false, true,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_149(this, false, "A1ECFBB4CA651530E519B06161363232", true, false,
						"Config_4", "/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs",	"/p1iYoULu-3/EO7tffDX6M/Xa9wt06t/JWAdSyID/H2IEYgZD/IBs", true, false), 194, 100, "A1ECFBB4CA653C8BE519B06161363232", 3);
				httpParallel.addRequest(9, request_150(this, false, "A1ECFBB4CA675F44E519B06161363232", true, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 25, 100, "A1ECFBB4CA63B5FFE519B06161363232", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_139(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_140(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_141(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_142(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_143(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_144(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_145(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_146(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_147(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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

	public HTTPAction request_148(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_23(postData);
				
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
	private void postDataClass_23(HTTPPostData postData) {
				StringBuffer strBuf_22 = new StringBuffer();
strBuf_22.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_22.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_22.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_22.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1394231,2560,1401,25");
strBuf_22.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_22.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.64094065");
strBuf_22.append("0320,828475697115.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_22.append("dm_en,t_en-1,2,-94,-105,0,2,0,0,1015,922,0;1,-1,0,0,1388,883");
strBuf_22.append(",0;-1,2,-94,-102,0,2,0,0,1015,922,0;1,-1,0,0,1388,883,0;-1,2");
strBuf_22.append(",-94,-108,-1,2,-94,-110,-1,2,-94,-117,-1,2,-94,-111,-1,2,-94");
strBuf_22.append(",-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://www.");
strBuf_22.append("officedepot.com/cart/checkout.do-1,2,-94,-115,1,32,32,0,0,0,");
strBuf_22.append("0,1,0,1656951394231,-999999,17725,0,0,2954,0,0,3,0,0,6477B51");
strBuf_22.append("7AA19C8A6D24FA64BF87FBEC1~-1~YAAQb4PXF5EDDreBAQAA0Lj/yQjllrR");
strBuf_22.append("6vRjTyvjsc1sytJ8lFFWjOQn3AKs56cefLXXHcWgRKXZhFT/+2BIg+c+2lUt");
strBuf_22.append("Pf9+ZBzd8dRTw/XC+90NaaWu21nsqux/nd1neCplvRHgb7KzwLFKhuSrnNun");
strBuf_22.append("aYj055MUYe0cPp3UgGaIRhsKGgb5WYSqi/b9dMlJ+tnJkSuI0kCDstKQQVyX");
strBuf_22.append("aiW10NeuwG+fFQSkB4cce4lg8tQrM5YEvZ80pnuGkaQo79eMffzZizwDhgy5");
strBuf_22.append("fEtJ7PxHtrLAu7+eQEdhOHAXrV832dZ53OiEB7VnFU9cw1klWwkhMdIkjsy2");
strBuf_22.append("E76zMiBPddSxmcEhdw38vsf2pBeb6X+H556IiaXgl07mEwHVKIAdL8sIx+++");
strBuf_22.append("b7FVoZB0bxb7c~-1~-1~-1,37380,-1,-1,30261693,PiZtE,66005,74,1");
strBuf_22.append("4,true-1,2,-94,-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0");
strBuf_22.append(",1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-12");
strBuf_22.append("7,8-1,2,-94,-70,-1-1,2,-94,-80,94-1,2,-94,-116,20913420-1,2,");
strBuf_22.append("-94,-118,89921-1,2,-94,-129,-1,2,-94,-121,;8;-1;0\"}");
String requestData_23 = strBuf_22.toString();
			
	HTTPPostDataChunk pdc_22 = new HTTPPostDataChunk("A1ECFBB4CA656364E519B06161363232", postData, requestData_23, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_22);

	}

	public HTTPAction request_149(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_24(postData);
				
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
	private void postDataClass_24(HTTPPostData postData) {
				StringBuffer strBuf_23 = new StringBuffer();
strBuf_23.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9354791.75-1,2,-94,-100,Mozi");
strBuf_23.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_23.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_23.append("147,20030107,en-GB,Gecko,5,0,0,0,407688,1394231,2560,1401,25");
strBuf_23.append("60,1441,1240,891,1255,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_23.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.08278582");
strBuf_23.append("541,828475697115.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_23.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_23.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_23.append("1,2,-94,-105,0,2,0,0,1015,922,0;1,-1,0,0,1388,883,0;-1,2,-94");
strBuf_23.append(",-102,0,2,0,0,1015,922,0;1,-1,0,0,1388,883,0;-1,2,-94,-108,-");
strBuf_23.append("1,2,-94,-110,-1,2,-94,-117,-1,2,-94,-111,0,221,-1,-1,-1;-1,2");
strBuf_23.append(",-94,-109,0,219,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,");
strBuf_23.append("2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/cart/ch");
strBuf_23.append("eckout.do-1,2,-94,-115,1,32,32,221,219,0,440,558,0,165695139");
strBuf_23.append("4231,31,17725,0,0,2954,0,0,560,440,0,6477B517AA19C8A6D24FA64");
strBuf_23.append("BF87FBEC1~-1~YAAQb4PXF90DDreBAQAArdD/yQhLl+PF8EcdH5jXHK3M44P");
strBuf_23.append("5UligFkPxwIeWqchasqzBQjCrJ0qg/mfqYV+zmopH8mjZQJgTJijZkYOCxj4");
strBuf_23.append("8Nd+rGJKUeSWlEz7y+XzOBPNoc7bhh3rMnBiHJpTN7wdpDcMnNziUhGIdd3H");
strBuf_23.append("Xadvk+BPseuz/B0zABzfYszeVSg4WsJ1WrCb5Gdc92LT6jl5DW113QQt18hK");
strBuf_23.append("SJivGSXUopWTZBPEcxISPTWfE+4uXt08lruLjR/a97a/SbvIz462vsFru30Q");
strBuf_23.append("1TmeStPoLHrxUqlGr66easbi2zXeV+AFv4LuR8fbW0Ju523IAfLdFyxjDkyz");
strBuf_23.append("507BICBkVMy5fTsPMaQs4WHDP9r+gFIXKqlZ7f3DP3GwSx1NjaQL7NbJo~-1");
strBuf_23.append("~-1~-1,37281,395,-140118619,30261693,PiZtE,106578,47,14,true");
strBuf_23.append("-1,2,-94,-106,9,1-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0");
strBuf_23.append("-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,2132");
strBuf_23.append("1144241322243122-1,2,-94,-70,273720021;-851345892;dis;,7;tru");
strBuf_23.append("e;true;true;-60;true;24;24;true;false;-1-1,2,-94,-80,5372-1,");
strBuf_23.append("2,-94,-116,20913420-1,2,-94,-118,101829-1,2,-94,-129,,,0,,,,");
strBuf_23.append("0-1,2,-94,-121,;8;12;0\"}");
String requestData_24 = strBuf_23.toString();
			
	HTTPPostDataChunk pdc_23 = new HTTPPostDataChunk("A1ECFBB4CA673824E519B06161363232", postData, requestData_24, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_23);

	}

	public HTTPAction request_150(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
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
	
			postDataClass_25(postData);
				
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
	private void postDataClass_25(HTTPPostData postData) {
				StringBuffer strBuf_24 = new StringBuffer();
strBuf_24.append("id=f3a4d4b7-5f38-4c37-b4b2-f16aa44329d3&tagId=11024&fullRefe");
strBuf_24.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fcart%2Fcheckout.");
strBuf_24.append("do&payload=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%2215");
strBuf_24.append("23082%22%2C%22cartSubtotal%22%3A%2224.990%22%2C%22trackingSo");
strBuf_24.append("urce%22%3A%22gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22%22%");
strBuf_24.append("3A%7B%22userId%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C%22m");
strBuf_24.append("arketing_channel%22%3A%22In%20Progress%22%7D%7D%7D&isDeviceA");
strBuf_24.append("ccessGranted=false&cjUser=00000000-0000-0000-0000-0000000000");
strBuf_24.append("00&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_25 = strBuf_24.toString();
			
	HTTPPostDataChunk pdc_24 = new HTTPPostDataChunk("A1ECFBB4CA675FAEE519B06161363232", postData, requestData_25, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_24);

	}
}
