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

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
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
import com.ibm.rational.test.lt.kernel.IDataArea;
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
public class C100msDelayDetection_2__Test_A1ECF7CFF5AADFB0D465E53465666464 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(58);
	private DataVar[] vars = new DataVar[10];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public C100msDelayDetection_2__Test_A1ECF7CFF5AADFB0D465E53465666464(IContainer container, String invocationId) {
		super(container, "100ms delay detection(2)", invocationId, "A1ECF7CFF5AADFB0D465E53465666464");
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
	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(confCon_6(this));
	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
	this.add(page_5(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: C100msDelayDetection_2__Test_A1ECF7CFF5AADFB0D465E53465666464 ",e);
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

		action.setMapFile("A1ECF7CFF5AADFB0D465E53465666464");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0
		// com.ibm.rational.test.lt.datatransform.adapters.impl.JsonAdapterVERSION_0

		return action;
	}
private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1ECF7CFF5AB06DAD465E53465666464");	
			vars[0] = new DataVar("100ms delay detection_Host", "www.officedepot.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("100ms delay detection_Host_1", "ma.officedepot.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("100ms delay detection_Host_2", "api.officedepot.io", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("100ms delay detection_Host_3", "officedepot.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("100ms delay detection_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("100ms delay detection_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("100ms delay detection_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("100ms delay detection_Host_Port_1", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("100ms delay detection_Host_3_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[9] = new DataVar("100ms delay detection_Host_3_Port_1", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
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
					(String)(vars[3].getValue()== null?"officedepot.com": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[9].getValue()== null?"443": (String)vars[9].getValue())), 
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
					(String)(vars[3].getValue()== null?"officedepot.com": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[8].getValue()== null?"80": (String)vars[8].getValue())), 
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
					(String)(vars[0].getValue()== null?"www.officedepot.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[7].getValue()== null?"80": (String)vars[7].getValue())), 
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
					(String)(vars[0].getValue()== null?"www.officedepot.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[6].getValue()== null?"443": (String)vars[6].getValue())), 
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
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[1].getValue()== null?"ma.officedepot.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[5].getValue()== null?"443": (String)vars[5].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"ma.officedepot.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_6(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_6",
					(String)(vars[2].getValue()== null?"api.officedepot.io": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[4].getValue()== null?"443": (String)vars[4].getValue())), 
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
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1ECF7CFF68CDB4ED465E53465666464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "officedepot.com", "A1ECF7CFF68CDB4ED465E53465666464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1ECF7CFF68CDB40D465E53465666464", true, true,
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF68CDB5CD465E53465666464", getHTTPTest());
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
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Location_1", dcVars[0], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[3], false, "Host_111", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
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
			"A1ECF7CFF68CDB5FD465E53465666464",
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
			HTTPThink think = new HTTPThink(1345, 1, parent, parent, "A1ECF7CFF68D2968D465E53465666464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Office Depot OfficeMax | Official Online Store", "A1ECF7CFF68D2968D465E53465666464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1ECF7CFF68D02D4D465E53465666464", true, false,
						"Config_2", "/",	"/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1ECF7CFF68D29DDD465E53465666464", true, false,
						"Config_3", "/",	"/", true, false), 4, 100, "A1ECF7CFF68D296CD465E53465666464", 3);
				httpParallel.addRequest(2, request_4(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, true,
						"Config_4", "/",	"/", true, false), 5, 100, "A1ECF7CFF68D29E5D465E53465666464", 3);
				httpParallel.addRequest(2, request_5(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/styles/od/master.min.5c50de2a13.css",	"/styles/od/master.min.5c50de2a13.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_6(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/styles/od/master_integration.min.9fff906f06.css",	"/styles/od/master_integration.min.9fff906f06.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_7(this, false, "A1ECF7CFF690FA43D465E53465666464", false, false,
						"Config_4", "/styles/od/home.min.29c4974d9e.css",	"/styles/od/home.min.29c4974d9e.css", true, false), 144, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(2, request_8(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/styles/od/promoCouponOffer.min.f052d92eba.css",	"/styles/od/promoCouponOffer.min.f052d92eba.css", true, false), 737, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(4, request_9(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/styles/od/catalog.min.5a99e51adb.css",	"/styles/od/catalog.min.5a99e51adb.css", true, false), 150, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(5, request_10(this, false, "A1ECF7CFF6919683D465E53465666464", false, false,
						"Config_4", "/styles/od/product.min.107359d744.css",	"/styles/od/product.min.107359d744.css", true, false), 151, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(6, request_11(this, false, "A1ECF7CFF6920BACD465E53465666464", false, false,
						"Config_4", "/styles/od/promo.min.944a7319eb.css",	"/styles/od/promo.min.944a7319eb.css", true, false), 152, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(7, request_12(this, false, "A1ECF7CFF692809FD465E53465666464", false, false,
						"Config_5", "/header/static/css/main.css",	"/header/static/css/main.css", true, false), 189, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(8, request_13(this, false, "A1ECF7CFF6931CD3D465E53465666464", false, false,
						"Config_5", "/analytics-utils/static/js/main.js",	"/analytics-utils/static/js/main.js", true, false), 189, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(9, request_14(this, false, "A1ECF7CFF6939203D465E53465666464", false, false,
						"Config_4", "/resource/css/5752/b373928af1d699ec7ecd59634738a191/officedepot.css",	"/resource/css/5752/b373928af1d699ec7ecd59634738a191/officedepot.css", true, false), 144, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(3, request_15(this, false, "A1ECF7CFF690FA43D465E53465666464", false, false,
						"Config_4", "/styles/global_header.min.43bdc2f4ab72509b3666.css",	"/styles/global_header.min.43bdc2f4ab72509b3666.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_16(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/styles/global_header_persistent_ad_banner.min.572b4edcb5a3ca106554.css",	"/styles/global_header_persistent_ad_banner.min.572b4edcb5a3ca106554.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_17(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/js/vendor.min.03c9568d477777bf48bc68a05179b80c.js",	"/js/vendor.min.03c9568d477777bf48bc68a05179b80c.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_18(this, false, "A1ECF7CFF6920BACD465E53465666464", false, false,
						"Config_4", "/js/od/polyfills.min.65154f27d7.js",	"/js/od/polyfills.min.65154f27d7.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_19(this, false, "A1ECF7CFF6919683D465E53465666464", false, false,
						"Config_4", "/js/od/master.min.5207ac93c9.js",	"/js/od/master.min.5207ac93c9.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(9, request_20(this, false, "A1ECF7CFF6939203D465E53465666464", false, false,
						"Config_4", "/resource/js/5752/ccee5184099bcbed20d3836cb8acfd3/officedepot.js",	"/resource/js/5752/ccee5184099bcbed20d3836cb8acfd3/officedepot.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_21(this, false, "A1ECF7CFF690FA43D465E53465666464", false, false,
						"Config_4", "/js/react.min.808706b2a48846c498f2c78838ef1de8.js",	"/js/react.min.808706b2a48846c498f2c78838ef1de8.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_22(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/js/global_vars.min.15b120702102e07d268b.js",	"/js/global_vars.min.15b120702102e07d268b.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_23(this, false, "A1ECF7CFF6920BACD465E53465666464", false, false,
						"Config_4", "/js/global_header_persistent_ad_banner.min.840d16a3865b853e3444.js",	"/js/global_header_persistent_ad_banner.min.840d16a3865b853e3444.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_24(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/js/global_header.min.162716bfb3fc61f47538.js",	"/js/global_header.min.162716bfb3fc61f47538.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_25(this, false, "A1ECF7CFF6919683D465E53465666464", false, false,
						"Config_4", "/styles/global_footer.min.7e2a206d5effc90b09d9.css",	"/styles/global_footer.min.7e2a206d5effc90b09d9.css", true, false), 1631, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(8, request_26(this, false, "A1ECF7CFF6931CD3D465E53465666464", false, false,
						"Config_5", "/footer/static/css/main.css",	"/footer/static/css/main.css", true, false), 1633, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(9, request_27(this, false, "A1ECF7CFF6939203D465E53465666464", false, false,
						"Config_4", "/js/od/promoCouponOffer.min.a64674e9ef.js",	"/js/od/promoCouponOffer.min.a64674e9ef.js", true, false), 1636, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(4, request_28(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/js/od/pagebuilder.min.89d2e75f46.js",	"/js/od/pagebuilder.min.89d2e75f46.js", true, false), 1718, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(6, request_29(this, false, "A1ECF7CFF6920BACD465E53465666464", false, false,
						"Config_4", "/js/od/product.min.4b742f299b.js",	"/js/od/product.min.4b742f299b.js", true, false), 1719, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(2, request_30(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/styles/business_select.min.4957f754587baf40831a.css",	"/styles/business_select.min.4957f754587baf40831a.css", true, false), 1719, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(3, request_31(this, false, "A1ECF7CFF690FA43D465E53465666464", false, false,
						"Config_4", "/styles/products_rail.min.059bce0908eec301bc6c.css",	"/styles/products_rail.min.059bce0908eec301bc6c.css", true, false), 1719, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(5, request_32(this, false, "A1ECF7CFF6919683D465E53465666464", false, false,
						"Config_4", "/js/products_rail.min.4cf72b10c23be0bce58a.js",	"/js/products_rail.min.4cf72b10c23be0bce58a.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(9, request_33(this, false, "A1ECF7CFF6939203D465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_34(this, false, "A1ECF7CFF690FA43D465E53465666464", false, false,
						"Config_4", "/js/cm_ga_conversion.min.af481c4d1f9e60f10569.js",	"/js/cm_ga_conversion.min.af481c4d1f9e60f10569.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_35(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/akam/13/93e9ed8",	"/akam/13/93e9ed8", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_36(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/fm/files/od/inktoner_v2/new_brand_tiles/350x191_epson.png",	"/fm/files/od/inktoner_v2/new_brand_tiles/350x191_epson.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_37(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/resource/blob/52/180e82018d1c6ea639900946dd899732/loader-big-gif-data.gif",	"/resource/blob/52/180e82018d1c6ea639900946dd899732/loader-big-gif-data.gif", true, false), 1075, 100, "A1ECF7CFF6939211D465E53465666464", 2);
				httpParallel.addRequest(8, request_38(this, false, "A1ECF7CFF6931CD3D465E53465666464", true, false,
						"Config_5", "/header/static/js/main.js",	"/header/static/js/main.js", true, false), 2071, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(2, request_39(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/js/analytics_monetate.min.1cd6c20f821df6414488.js",	"/js/analytics_monetate.min.1cd6c20f821df6414488.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_40(this, false, "A1ECF7CFF692809FD465E53465666464", true, false,
						"Config_5", "/footer/static/js/main.js",	"/footer/static/js/main.js", true, false), 2189, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(2, request_41(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/js/print.min.d48100ea4f05518488a1.js",	"/js/print.min.d48100ea4f05518488a1.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_42(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/js/business_select.min.302846b0b19233a6511e.js",	"/js/business_select.min.302846b0b19233a6511e.js", true, false), 2528, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
				httpParallel.addRequest(2, request_43(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/js/remove_sw.min.d0cd10b0f20ea453eab8.js",	"/js/remove_sw.min.d0cd10b0f20ea453eab8.js", true, false), 2672, 100, "A1ECF7CFF68D50F7D465E53465666464", 2);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF68D296CD465E53465666464", getHTTPTest());
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
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Location_1", dcVars[1], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[0], false, "Office Depot OfficeM_url_35", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[3], false, "Host_110", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	


		
				
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
			"A1ECF7CFF68D296FD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF68D29E5D465E53465666464", getHTTPTest());
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
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Location_1", dcVars[2], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_3", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_3 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[1], false, "Office Depot OfficeM_url_34", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_109", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D296CD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D296CD465E53465666464"), 3);		
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
			"A1ECF7CFF68D5070D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF68D50F7D465E53465666464", getHTTPTest());
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
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[3], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[4], " href=\"(.*?)\"", 20, 20, 0, 0, false, "href_12", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[5], " href=\"(.*?)\"", 21, 1, 0, 0, false, "href_11", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[6], " href=\"(.*?)\"", 22, 1, 0, 0, false, "href_10", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[7], " href=\"(.*?)\"", 23, 1, 0, 0, false, "href_9", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[8], " href=\"(.*?)\"", 24, 1, 0, 0, false, "href_8", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[9], " href=\"(.*?)\"", 25, 1, 0, 0, false, "href_7", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[10], " href=\"(.*?)\"", 26, 1, 0, 0, false, "href_6", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[11], " src=\"(.*?)\"", 1, 1, 0, 0, false, "src_17", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[12], " src=\"(.*?)\"", 2, 1, 0, 0, false, "src_16", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[13], " src=\"(.*?)\"", 3, 1, 0, 0, false, "src_15", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[14], " src=\"(.*?)\"", 4, 1, 0, 0, false, "src_6", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[15], "/www\\.officedepot\\.com(.*?)\"", 10, 1, 0, 0, false, "www.officedepot.com_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[16], "/www\\.officedepot\\.com(.*?)\"", 11, 1, 0, 0, false, "www.officedepot.com_3", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[17], " src=\"(.*?)\"", 6, 1, 0, 0, false, "src_14", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[18], "/www\\.officedepot\\.com(.*?)\"", 14, 1, 0, 0, false, "www.officedepot.com_2", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[19], " src=\"(.*?)\"", 21, 13, 0, 0, false, "src_13", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[20], " href=\"(.*?)\"", 56, 1, 0, 0, false, "href_5", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[21], " href=\"(.*?)\"", 57, 1, 0, 0, false, "href_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[22], " src=\"(.*?)\"", 22, 1, 0, 0, false, "src_12", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[23], " src=\"(.*?)\"", 23, 1, 0, 0, false, "src_11", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[24], " src=\"(.*?)\"", 41, 18, 0, 0, false, "src_5", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[25], " href=\"(.*?)\"", 656, 65, 0, 0, false, "href_3", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[26], "script src=\"(.*?)\"", 12, 1, 0, 0, false, "src_10", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[27], " src=\"(.*?)\"", 100, 1, 0, 0, false, "src_9", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[28], " src=\"(.*?)\"", 101, 1, 0, 0, false, "src_8", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[29], " window\\.printStyle = '(.*?)'", 1, 1, 0, 0, false, "window.printStyle", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[30], "script src=\"(.*?)\"", 15, 1, 0, 0, false, "src_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[31], " src=\"(.*?)\"", 105, 1, 0, 0, false, "src_3", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[32], "rel=\"preload\" as=\"style\" type=\"text/css\" onload=\"this.onload=null;this.rel='stylesheet'\" href=\"(.*?)\"", 1, 1, 0, 0, false, "href_2", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[33], "script src=\"(.*?)\"", 17, 1, 0, 0, false, "src_2", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[34], "rel=\"stylesheet\" type=\"text/css\" href=\"(.*?)\"", 11, 1, 0, 0, false, "href", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[35], " src=\"(.*?)\"", 108, 1, 0, 0, false, "src_7", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[36], "/www\\.officedepot\\.com(.*?)\\?", 12, 1, 0, 0, false, "www.officedepot.com", null, 0, false);
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_5 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[2], false, "Office Depot OfficeM_url_33", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_108", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);		
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
			"A1ECF7CFF68D50FAD465E53465666464",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF68EFE20D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_7 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_107", null, 0, false);
	subContainer_5.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_uri", 0, 36, false, (IDCCoreVar)dcVars[4], false, "Office Depot OfficeM_url_32", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_107", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF68EFE23D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF690D2E3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_10 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_106", null, 0, false);
	subContainer_6.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_uri", 0, 48, false, (IDCCoreVar)dcVars[5], false, "Office Depot OfficeM_url_31", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_106", null, 0, false);
	subContainer_6.addSubInstruction(sub_12);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF690D2E6D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF690FA51D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_105", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_uri", 0, 34, false, (IDCCoreVar)dcVars[6], false, "Office Depot OfficeM_url_30", null, 0, false);
	subContainer_7.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_105", null, 0, false);
	subContainer_7.addSubInstruction(sub_15);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF690FA54D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6914837D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_16 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_104", null, 0, false);
	subContainer_8.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_uri", 0, 46, false, (IDCCoreVar)dcVars[7], false, "Office Depot OfficeM_url_29", null, 0, false);
	subContainer_8.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_104", null, 0, false);
	subContainer_8.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF691483AD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6916F80D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_103", null, 0, false);
	subContainer_9.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_uri", 0, 37, false, (IDCCoreVar)dcVars[8], false, "Office Depot OfficeM_url_28", null, 0, false);
	subContainer_9.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_103", null, 0, false);
	subContainer_9.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6916F83D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6919691D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_22 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_102", null, 0, false);
	subContainer_10.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_uri", 0, 37, false, (IDCCoreVar)dcVars[9], false, "Office Depot OfficeM_url_27", null, 0, false);
	subContainer_10.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_102", null, 0, false);
	subContainer_10.addSubInstruction(sub_24);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6919694D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6920BBAD465E53465666464", getHTTPTest());
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
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_101", null, 0, false);
	subContainer_11.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_uri", 0, 35, false, (IDCCoreVar)dcVars[10], false, "Office Depot OfficeM_url_26", null, 0, false);
	subContainer_11.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_101", null, 0, false);
	subContainer_11.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6920BBDD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69280ADD465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_100", null, 0, false);
	subContainer_12.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_100", null, 0, false);
	subContainer_12.addSubInstruction(sub_29);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69280B0D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6931CE1D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_30 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_99", null, 0, false);
	subContainer_13.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_99", null, 0, false);
	subContainer_13.addSubInstruction(sub_31);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6931CE4D465E53465666464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6939211D465E53465666464", getHTTPTest());
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
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[37], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[38], " url\\((.*?)\\)", 3, 3, 0, 0, false, "url(_2", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[39], ":url\\((.*?)\\)", 35, 19, 0, 0, false, "url(", null, 0, false);
	IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_32 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_98", null, 0, false);
	subContainer_14.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_uri", 0, 67, false, (IDCCoreVar)dcVars[15], false, "Office Depot OfficeM_url_25", null, 0, false);
	subContainer_14.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_98", null, 0, false);
	subContainer_14.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6939214D465E53465666464",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6945553D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_35 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_97", null, 0, false);
	subContainer_15.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_uri", 0, 50, false, (IDCCoreVar)dcVars[20], false, "Office Depot OfficeM_url_24", null, 0, false);
	subContainer_15.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_97", null, 0, false);
	subContainer_15.addSubInstruction(sub_37);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6945556D465E53465666464",
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

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6947CB3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_38 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_96", null, 0, false);
	subContainer_16.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_uri", 0, 71, false, (IDCCoreVar)dcVars[21], false, "Office Depot OfficeM_url_23", null, 0, false);
	subContainer_16.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_96", null, 0, false);
	subContainer_16.addSubInstruction(sub_40);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6947CB6D465E53465666464",
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

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF694A3C3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_41 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_95", null, 0, false);
	subContainer_17.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_uri", 0, 50, false, (IDCCoreVar)dcVars[11], false, "Office Depot OfficeM_url_22", null, 0, false);
	subContainer_17.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_95", null, 0, false);
	subContainer_17.addSubInstruction(sub_43);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF694A3C6D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF694F1A7D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_44 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_94", null, 0, false);
	subContainer_18.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_uri", 0, 34, false, (IDCCoreVar)dcVars[12], false, "Office Depot OfficeM_url_21", null, 0, false);
	subContainer_18.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_94", null, 0, false);
	subContainer_18.addSubInstruction(sub_46);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF694F1AAD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69518F3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_47 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_93", null, 0, false);
	subContainer_19.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_uri", 0, 31, false, (IDCCoreVar)dcVars[13], false, "Office Depot OfficeM_url_20", null, 0, false);
	subContainer_19.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_93", null, 0, false);
	subContainer_19.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69518F6D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69825E3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_92", null, 0, false);
	subContainer_20.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_uri", 0, 64, false, (IDCCoreVar)dcVars[16], false, "Office Depot OfficeM_url_19", null, 0, false);
	subContainer_20.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_92", null, 0, false);
	subContainer_20.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69825E6D465E53465666464",
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

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF699AC83D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_53 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_91", null, 0, false);
	subContainer_21.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_uri", 0, 49, false, (IDCCoreVar)dcVars[17], false, "Office Depot OfficeM_url_18", null, 0, false);
	subContainer_21.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_91", null, 0, false);
	subContainer_21.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF699AC86D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69ABDF3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_56 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_90", null, 0, false);
	subContainer_22.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_uri", 0, 43, false, (IDCCoreVar)dcVars[19], false, "Office Depot OfficeM_url_17", null, 0, false);
	subContainer_22.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_90", null, 0, false);
	subContainer_22.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69ABDF6D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69B0C19D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_59 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_89", null, 0, false);
	subContainer_23.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_uri", 0, 66, false, (IDCCoreVar)dcVars[22], false, "Office Depot OfficeM_url_16", null, 0, false);
	subContainer_23.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_89", null, 0, false);
	subContainer_23.addSubInstruction(sub_61);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69B0C1CD465E53465666464",
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

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69B5A57D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_62 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_88", null, 0, false);
	subContainer_24.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_uri", 0, 45, false, (IDCCoreVar)dcVars[23], false, "Office Depot OfficeM_url_15", null, 0, false);
	subContainer_24.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_88", null, 0, false);
	subContainer_24.addSubInstruction(sub_64);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69B5A5AD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69BF670D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_65 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_87", null, 0, false);
	subContainer_25.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_uri", 0, 50, false, (IDCCoreVar)dcVars[25], false, "Office Depot OfficeM_url_14", null, 0, false);
	subContainer_25.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_87", null, 0, false);
	subContainer_25.addSubInstruction(sub_67);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69BF673D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69C1D88D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_68 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_86", null, 0, false);
	subContainer_26.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_86", null, 0, false);
	subContainer_26.addSubInstruction(sub_69);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69C1D8BD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF69C44DBD465E53465666464", getHTTPTest());
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
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_70 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_85", null, 0, false);
	subContainer_27.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_uri", 0, 41, false, (IDCCoreVar)dcVars[26], false, "Office Depot OfficeM_url_13", null, 0, false);
	subContainer_27.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_85", null, 0, false);
	subContainer_27.addSubInstruction(sub_72);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF69C44DED465E53465666464",
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

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6B76DB0D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_73 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_84", null, 0, false);
	subContainer_28.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_uri", 0, 36, false, (IDCCoreVar)dcVars[27], false, "Office Depot OfficeM_url_12", null, 0, false);
	subContainer_28.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_84", null, 0, false);
	subContainer_28.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6B794C0D465E53465666464",
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

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6B7BC23D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_76 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_83", null, 0, false);
	subContainer_29.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_uri", 0, 32, false, (IDCCoreVar)dcVars[28], false, "Office Depot OfficeM_url_11", null, 0, false);
	subContainer_29.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_83", null, 0, false);
	subContainer_29.addSubInstruction(sub_78);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6B7BC26D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6B87F20D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_79 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_82", null, 0, false);
	subContainer_30.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_uri", 0, 52, false, (IDCCoreVar)dcVars[32], false, "Office Depot OfficeM_url_10", null, 0, false);
	subContainer_30.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_82", null, 0, false);
	subContainer_30.addSubInstruction(sub_81);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6B87F23D465E53465666464",
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

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6BF35E0D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_82 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_81", null, 0, false);
	subContainer_31.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_uri", 0, 50, false, (IDCCoreVar)dcVars[34], false, "Office Depot OfficeM_url_9", null, 0, false);
	subContainer_31.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_81", null, 0, false);
	subContainer_31.addSubInstruction(sub_84);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6BF35E3D465E53465666464",
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

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6BF8402D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_85 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_80", null, 0, false);
	subContainer_32.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_uri", 0, 45, false, (IDCCoreVar)dcVars[35], false, "Office Depot OfficeM_url_8", null, 0, false);
	subContainer_32.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_80", null, 0, false);
	subContainer_32.addSubInstruction(sub_87);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6BF8405D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C02043D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_88 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_79", null, 0, false);
	subContainer_33.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_79", null, 0, false);
	subContainer_33.addSubInstruction(sub_89);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6C02046D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C30677D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_90 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_78", null, 0, false);
	subContainer_34.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_uri", 0, 48, false, (IDCCoreVar)dcVars[14], false, "Office Depot OfficeM_url_7", null, 0, false);
	subContainer_34.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_78", null, 0, false);
	subContainer_34.addSubInstruction(sub_92);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6C3067AD465E53465666464",
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

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C354E3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_93 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_77", null, 0, false);
	subContainer_35.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_uri", 0, 16, false, (IDCCoreVar)dcVars[18], false, "Office Depot OfficeM_url_6", null, 0, false);
	subContainer_35.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_77", null, 0, false);
	subContainer_35.addSubInstruction(sub_95);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6C354E6D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C37BF3D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_96 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_76", null, 0, false);
	subContainer_36.addSubInstruction(sub_96);
		ISubRule sub_97 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_76", null, 0, false);
	subContainer_36.addSubInstruction(sub_97);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);		
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
			"A1ECF7CFF6C37BF6D465E53465666464",
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

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C3A33CD465E53465666464", getHTTPTest());
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
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_98 = new SubRule("req_hdr_Referer_1", 0, 94, false, (IDCCoreVar)dcVars[37], false, "Referer_75", null, 0, false);
	subContainer_37.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_uri", 0, 74, false, (IDCCoreVar)dcVars[38], false, "Office Depot OfficeM_url_5", null, 0, false);
	subContainer_37.addSubInstruction(sub_99);
		ISubRule sub_100 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_75", null, 0, false);
	subContainer_37.addSubInstruction(sub_100);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6939211D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6939211D465E53465666464"), 3);		
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
			"A1ECF7CFF6C3A33FD465E53465666464",
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

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C3CA39D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_101 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_74", null, 0, false);
	subContainer_38.addSubInstruction(sub_101);
		ISubRule sub_102 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_74", null, 0, false);
	subContainer_38.addSubInstruction(sub_102);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C354E3D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);		
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
			"A1ECF7CFF6C3CA3CD465E53465666464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6C94803D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_103 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_73", null, 0, false);
	subContainer_39.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_uri", 0, 50, false, (IDCCoreVar)dcVars[24], false, "Office Depot OfficeM_url_4", null, 0, false);
	subContainer_39.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_73", null, 0, false);
	subContainer_39.addSubInstruction(sub_105);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C354E3D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);		
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
			"A1ECF7CFF6C94806D465E53465666464",
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

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CA3263D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_106 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_72", null, 0, false);
	subContainer_40.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_72", null, 0, false);
	subContainer_40.addSubInstruction(sub_107);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C354E3D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);		
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
			"A1ECF7CFF6CA3266D465E53465666464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CC5543D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_108 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_71", null, 0, false);
	subContainer_41.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_uri", 0, 37, false, (IDCCoreVar)dcVars[30], false, "Office Depot OfficeM_url_3", null, 0, false);
	subContainer_41.addSubInstruction(sub_109);
		ISubRule sub_110 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_71", null, 0, false);
	subContainer_41.addSubInstruction(sub_110);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C354E3D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);		
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
			"A1ECF7CFF6CC5546D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CCA362D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_111 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_70", null, 0, false);
	subContainer_42.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_uri", 0, 47, false, (IDCCoreVar)dcVars[31], false, "Office Depot OfficeM_url_2", null, 0, false);
	subContainer_42.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_70", null, 0, false);
	subContainer_42.addSubInstruction(sub_113);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C354E3D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);		
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
			"A1ECF7CFF6CCA365D465E53465666464",
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

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CD66B3D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656522718076%22%3A%7B%7D%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_114 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_69", null, 0, false);
	subContainer_43.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_uri", 0, 41, false, (IDCCoreVar)dcVars[33], false, "Office Depot OfficeM_url", null, 0, false);
	subContainer_43.addSubInstruction(sub_115);
		ISubRule sub_116 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_69", null, 0, false);
	subContainer_43.addSubInstruction(sub_116);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C354E3D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D29E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF68D50F7D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6C02043D465E53465666464"), 3);		
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
			"A1ECF7CFF6CD66B6D465E53465666464",
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
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(1077, 1, parent, parent, "A1ECF7CFF6CDDC32D465E53465666464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "HQFje_jFRalo", "A1ECF7CFF6CDDC32D465E53465666464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(8, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_44(this, true, "A1ECF7CFF68D50E9D465E53465666464", false, true,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_45(this, false, "A1ECF7CFF6916F72D465E53465666464", false, false,
						"Config_4", "/styles/print.min.b06979a8c55fd07eb565.css",	"/styles/print.min.b06979a8c55fd07eb565.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_46(this, false, "A1ECF7CFF68D50E9D465E53465666464", false, false,
						"Config_4", "/resource/blob/38220/d58e2bf1f66bc015371d6d466fe464e8/carousel-btn-sprites-png-data.png",	"/resource/blob/38220/d58e2bf1f66bc015371d6d466fe464e8/carousel-btn-sprites-png-data.png", true, false), 196, 100, "A1ECF7CFF6CDDC36D465E53465666464", 3);
				httpParallel.addRequest(0, request_47(this, false, "A1ECF7CFF68D50E9D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 144, 100, "A1ECF7CFF6CE7874D465E53465666464", 3);
				httpParallel.addRequest(1, request_48(this, false, "A1ECF7CFF6916F72D465E53465666464", true, false,
						"Config_4", "/akam/13/pixel_93e9ed8",	"/akam/13/pixel_93e9ed8", true, false), 211, 100, "A1ECF7CFF6CE7874D465E53465666464", 3);
				httpParallel.addRequest(2, request_49(this, false, "A1ECF7CFF690FA43D465E53465666464", true, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=1&cachebuster=91791636",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=1&cachebuster=91791636", true, false), 1618, 100, "A1ECF7CFF6CEEDABD465E53465666464", 3);
				httpParallel.addRequest(3, request_50(this, false, "A1ECF7CFF6939203D465E53465666464", false, false,
						"Config_4", "/proxy/mczbf/tags/11024/tag.js",	"/proxy/mczbf/tags/11024/tag.js", true, false), 1740, 100, "A1ECF7CFF6CEEDABD465E53465666464", 3);
				httpParallel.addRequest(3, request_51(this, false, "A1ECF7CFF6939203D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 234, 100, "A1ECF7CFF6CF3B70D465E53465666464", 3);
				httpParallel.addRequest(4, request_52(this, false, "A1ECF7CFF6CFB0F3D465E53465666464", true, false,
						"Config_6", "/services/splunkjslogger/beacon.gif?src=GRAPHQL%20API%20call%20for%20Persistent%20Banner%20failed.&severity=error&msg=%7B%20error%3A%20TypeError%3A%20Cannot%20read%20properties%20of%20null%20(reading%20%27simplecardByPath%27)%2C%20msg%3A%20%27GRAPHQL%20API%20to%20retrieve%20response%20for%20for%20Persistent%20Banner%20in%20Header%20App%20failed.%27%7D&pageUrl=undefined&isClient=true&glassboxUrl=undefined",	"/services/splunkjslogger/beacon.gif?src=GRAPHQL%20API%20call%20for%20Persistent%20Banner%20failed.&severity=error&msg=%7B%20error%3A%20TypeError%3A%20Cannot%20read%20properties%20of%20null%20(reading%20%27simplecardByPath%27)%2C%20msg%3A%20%27GRAPHQL%20API%20to%20retrieve%20response%20for%20for%20Persistent%20Banner%20in%20Header%20App%20failed.%27%7D&pageUrl=undefined&isClient=true&glassboxUrl=undefined", true, false), 38, 100, "A1ECF7CFF6CF3B70D465E53465666464", 3);
				httpParallel.addRequest(5, request_53(this, false, "A1ECF7CFF6920BACD465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 955, 100, "A1ECF7CFF6CFB101D465E53465666464", 3);
				httpParallel.addRequest(5, request_54(this, false, "A1ECF7CFF6920BACD465E53465666464", true, false,
						"Config_4", "/mobile/getAjaxPriceListFromService.do?items=348037,101095,8597554,7607950,959569,907932,7049485,7476425,196517,751724,576868,219491,6129456,7613146,161444,8944121,7049036,6785666,956652,285674,333465,281901,6217486,7808444,633410",	"/mobile/getAjaxPriceListFromService.do?items=348037,101095,8597554,7607950,959569,907932,7049485,7476425,196517,751724,576868,219491,6129456,7613146,161444,8944121,7049036,6785666,956652,285674,333465,281901,6217486,7808444,633410", true, false), 152, 100, "A1ECF7CFF6CFD7E5D465E53465666464", 3);
				httpParallel.addRequest(6, request_55(this, false, "A1ECF7CFF6D04D3DD465E53465666464", true, false,
						"Config_6", "/services/predictsearch-service/api/2/?searchTerm=paper",	"/services/predictsearch-service/api/2/?searchTerm=paper", true, false), 1200, 100, "A1ECF7CFF6CFB101D465E53465666464", 3);
				httpParallel.addRequest(7, request_56(this, false, "A1ECF7CFF6919683D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 223, 100, "A1ECF7CFF6D04D4BD465E53465666464", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CDDC36D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656522718076%22%3A%7B%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_117 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_68", null, 0, false);
	subContainer_44.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_68", null, 0, false);
	subContainer_44.addSubInstruction(sub_118);
	


		
				
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
			"A1ECF7CFF6CDDC39D465E53465666464",
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
strBuf_1.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_1.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_1.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_1.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2719300,1920,1040,19");
strBuf_1.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_1.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.17138067");
strBuf_1.append("685,828261359649.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,d");
strBuf_1.append("m_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0");
strBuf_1.append(",0,0,0,-1,310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101");
strBuf_1.append(",-1,0;0,0,0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94,");
strBuf_1.append("-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103");
strBuf_1.append(",-1,2,-94,-112,https://www.officedepot.com/-1,2,-94,-115,1,3");
strBuf_1.append("2,32,0,0,0,0,3,0,1656522719299,-999999,17721,0,0,2953,0,0,6,");
strBuf_1.append("0,0,3B38199BDE94057FD0DC91B16F184356~-1~YAAQjPo7Fzs7MmSBAQAA");
strBuf_1.append("prhysAgwrs8uXgt9/6EM9TIRzpp+Uhw7ojzSm5stxdpgq30KrTMzMsQ+jxwc");
strBuf_1.append("IU7dPfq9dsjcK/BsZo4khbn/Wp2m8ZbST2BjkxLJqvQTOcOWqNpnvX9pXsTP");
strBuf_1.append("VQg/aV2A0r9FCR6zDoylvL/AkZ7GI4+3TAMuA1PEVvJVXQGwTr3iNbt0T7oD");
strBuf_1.append("1vHRfIomG1Wd4oqYWD+45LYXj0mhG0lTr/V9PqImvcv6Phv/dRHEek5fG0im");
strBuf_1.append("vvQgOdfBCWLYy9nUHdllN6eaaqXlp6R8+s9a85twHwxNF+5YReHv/smxOy9K");
strBuf_1.append("Jw4dMlQgqpKBl7cbFhWdLMu0E8Ej+rgjnsa3zmjRhZdoTql1kZXJOhtD57ZE");
strBuf_1.append("0rnJOXVWqNk/RdDu3OLtk+yt~-1~-1~-1,38048,-1,-1,30261693,PiZtE");
strBuf_1.append(",101768,43,14,true-1,2,-94,-106,0,0-1,2,-94,-119,-1-1,2,-94,");
strBuf_1.append("-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,");
strBuf_1.append("-1,2,-94,-127,8-1,2,-94,-70,-1-1,2,-94,-80,94-1,2,-94,-116,8");
strBuf_1.append("157924-1,2,-94,-118,90245-1,2,-94,-129,-1,2,-94,-121,;15;-1;");
strBuf_1.append("0\"}");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1ECF7CFF6CE02FDD465E53465666464", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CE2A00D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656522718076%22%3A%7B%7D%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_119 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_67", null, 0, false);
	subContainer_45.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_uri", 0, 42, false, (IDCCoreVar)dcVars[29], false, "HQFje_jFRalo_url_3", null, 0, false);
	subContainer_45.addSubInstruction(sub_120);
		ISubRule sub_121 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_67", null, 0, false);
	subContainer_45.addSubInstruction(sub_121);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CDDC36D465E53465666464"), 3);		
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
			"A1ECF7CFF6CE2A03D465E53465666464",
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

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CE7874D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "mt.mbsh=%7B%221656522718076%22%3A%7B%7D%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_122 = new SubRule("req_hdr_Referer_1", 0, 94, false, (IDCCoreVar)dcVars[37], false, "Referer_66", null, 0, false);
	subContainer_46.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_uri", 0, 87, false, (IDCCoreVar)dcVars[39], false, "HQFje_jFRalo_url_2", null, 0, false);
	subContainer_46.addSubInstruction(sub_123);
		ISubRule sub_124 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_66", null, 0, false);
	subContainer_46.addSubInstruction(sub_124);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CDDC36D465E53465666464"), 3);		
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
			"A1ECF7CFF6CE9F30D465E53465666464",
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

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CEC641D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1746", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_125 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_65", null, 0, false);
	subContainer_47.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_65", null, 0, false);
	subContainer_47.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CDDC36D465E53465666464"), 3);		
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
			"A1ECF7CFF6CEC644D465E53465666464",
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
strBuf_2.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_2.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_2.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_2.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2719300,1920,1040,19");
strBuf_2.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_2.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.21500676");
strBuf_2.append("5107,828261359649.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_2.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_2.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_2.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_2.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0");
strBuf_2.append(",0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94,-117,-1,2");
strBuf_2.append(",-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103,-1,2,-94");
strBuf_2.append(",-112,https://www.officedepot.com/-1,2,-94,-115,1,32,32,0,0,");
strBuf_2.append("0,0,783,0,1656522719299,147,17721,0,0,2953,0,0,784,0,0,3B381");
strBuf_2.append("99BDE94057FD0DC91B16F184356~-1~YAAQjPo7F1A7MmSBAQAAM8FysAhPC");
strBuf_2.append("GcublwQC3e2c4Giok+lsqvWo0pTkP0ia3Y4veQz+SJlODnhoXdtUPMpcqEIi");
strBuf_2.append("LfAent4JyBQt11nDbG8gm6Hct1K52rmsaFRY+agzIoBt9FcgPwVWFlTnaA3f");
strBuf_2.append("M9heWIa8gWfDaN34OeP0lTO2IN+AKRvdS9Ad1kTv4n8GE21QCxacuZM0ldz0");
strBuf_2.append("EJAULomfhIipeLVjQTjr6ibBbTgztRYkFvorw8tRI+jNqys1tz7UOWWFAU2n");
strBuf_2.append("nk603I62ND4Q6uAm2obj2PvePDzmgt2u0/Ofp6WgzDiy9Phkyz58C5PJKfDI");
strBuf_2.append("dQ1FFds4W4KMr070ktGZr6WB1W7b3FSl4NEbbsN0+j034DiUMBoc59b2ch5M");
strBuf_2.append("zMEX+Z10WaVb+Hr~-1~||1-wnRTWnUmZY-1-10-1000-2||~-1,38794,180");
strBuf_2.append(",2092719767,30261693,PiZtE,22493,64,14,true-1,2,-94,-106,9,1");
strBuf_2.append("-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,");
strBuf_2.append("2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322243122-");
strBuf_2.append("1,2,-94,-70,273720021;-851345892;dis;,7;true;true;true;-60;t");
strBuf_2.append("rue;24;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116,815792");
strBuf_2.append("4-1,2,-94,-118,100414-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;3;");
strBuf_2.append("20;0\"}");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1ECF7CFF6CEED50D465E53465666464", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CEEDABD465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3621", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_127 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_64", null, 0, false);
	subContainer_48.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_uri", 0, 22, false, (IDCCoreVar)dcVars[36], false, "HQFje_jFRalo_url", null, 0, false);
	subContainer_48.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_64", null, 0, false);
	subContainer_48.addSubInstruction(sub_129);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CDDC36D465E53465666464"), 3);		
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
			"A1ECF7CFF6CEEDAED465E53465666464",
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
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("ap=true&bt=%7B%22charging%22%3Atrue%2C%22chargingTime%22%3A%");
strBuf_3.append("22Infinity%22%2C%22dischargingTime%22%3A%22Infinity%22%2C%22");
strBuf_3.append("level%22%3A0.97%2C%22onchargingchange%22%3Anull%2C%22oncharg");
strBuf_3.append("ingtimechange%22%3Anull%2C%22ondischargingtimechange%22%3Anu");
strBuf_3.append("ll%2C%22onlevelchange%22%3Anull%7D&fonts=null&fh=null&timing");
strBuf_3.append("=%7B%221%22%3A132%2C%222%22%3A441%2C%223%22%3A705%2C%22profi");
strBuf_3.append("le%22%3A%7B%22bp%22%3A2%2C%22sr%22%3A0%2C%22dp%22%3A1%2C%22l");
strBuf_3.append("t%22%3A0%2C%22ps%22%3A0%2C%22cv%22%3A99%2C%22fp%22%3A0%2C%22");
strBuf_3.append("sp%22%3A3%2C%22br%22%3A0%2C%22ieps%22%3A0%2C%22av%22%3A0%2C%");
strBuf_3.append("22z1%22%3A21%2C%22jsv%22%3A2%2C%22nav%22%3A0%2C%22nap%22%3A3");
strBuf_3.append("%2C%22crc%22%3A0%2C%22z2%22%3A2%2C%22z3%22%3A1%7D%2C%22main%");
strBuf_3.append("22%3A4000%2C%22compute%22%3A132%2C%22send%22%3A705%7D&bp=208");
strBuf_3.append("7755996%2C1953464915%2C591862434%2C325835597%2C1068473606%2C");
strBuf_3.append("-1382186647%2C-365096851%2C-1979186206%2C-108039040%2C-19068");
strBuf_3.append("52049&sr=%7B%22inner%22%3A%5B1238%2C889%5D%2C%22outer%22%3A%");
strBuf_3.append("5B1254%2C1022%5D%2C%22screen%22%3A%5B10%2C10%5D%2C%22pageOff");
strBuf_3.append("set%22%3A%5B0%2C0%5D%2C%22avail%22%3A%5B1920%2C1040%5D%2C%22");
strBuf_3.append("size%22%3A%5B1920%2C1080%5D%2C%22client%22%3A%5B1221%2C6287%");
strBuf_3.append("5D%2C%22colorDepth%22%3A24%2C%22pixelDepth%22%3A24%7D&dp=%7B");
strBuf_3.append("%22XDomainRequest%22%3A0%2C%22createPopup%22%3A0%2C%22remove");
strBuf_3.append("EventListener%22%3A1%2C%22globalStorage%22%3A0%2C%22openData");
strBuf_3.append("base%22%3A1%2C%22indexedDB%22%3A1%2C%22attachEvent%22%3A0%2C");
strBuf_3.append("%22ActiveXObject%22%3A0%2C%22dispatchEvent%22%3A1%2C%22addBe");
strBuf_3.append("havior%22%3A0%2C%22addEventListener%22%3A1%2C%22detachEvent%");
strBuf_3.append("22%3A0%2C%22fireEvent%22%3A0%2C%22MutationObserver%22%3A1%2C");
strBuf_3.append("%22HTMLMenuItemElement%22%3A0%2C%22Int8Array%22%3A1%2C%22pos");
strBuf_3.append("tMessage%22%3A1%2C%22querySelector%22%3A1%2C%22getElementsBy");
strBuf_3.append("ClassName%22%3A1%2C%22images%22%3A1%2C%22compatMode%22%3A%22");
strBuf_3.append("CSS1Compat%22%2C%22documentMode%22%3A0%2C%22all%22%3A1%2C%22");
strBuf_3.append("now%22%3A1%2C%22contextMenu%22%3A0%7D&lt=1656522719448%2B1&p");
strBuf_3.append("s=true%2Ctrue&cv=257625ef7abc3cc6026bfa2db36e13f0313cb2ca&fp");
strBuf_3.append("=false&sp=false&br=Chrome&ieps=false&av=false&z=%7B%22a%22%3");
strBuf_3.append("A155098570%2C%22b%22%3A1%2C%22c%22%3A1%7D&zh=&jsv=1.7&nav=%7");
strBuf_3.append("B%22userAgent%22%3A%22Mozilla%2F5.0%20(Windows%20NT%2010.0%3");
strBuf_3.append("B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20lik");
strBuf_3.append("e%20Gecko)%20Chrome%2F102.0.5005.63%20Safari%2F537.36%22%2C%");
strBuf_3.append("22appName%22%3A%22Netscape%22%2C%22appCodeName%22%3A%22Mozil");
strBuf_3.append("la%22%2C%22appVersion%22%3A%225.0%20(Windows%20NT%2010.0%3B%");
strBuf_3.append("20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%");
strBuf_3.append("20Gecko)%20Chrome%2F102.0.5005.63%20Safari%2F537.36%22%2C%22");
strBuf_3.append("appMinorVersion%22%3A0%2C%22product%22%3A%22Gecko%22%2C%22pr");
strBuf_3.append("oductSub%22%3A%2220030107%22%2C%22vendor%22%3A%22Google%20In");
strBuf_3.append("c.%22%2C%22vendorSub%22%3A%22%22%2C%22buildID%22%3A0%2C%22pl");
strBuf_3.append("atform%22%3A%22Win32%22%2C%22oscpu%22%3A0%2C%22hardwareConcu");
strBuf_3.append("rrency%22%3A12%2C%22language%22%3A%22en-GB%22%2C%22languages");
strBuf_3.append("%22%3A%5B%22en-GB%22%2C%22en-US%22%2C%22en%22%5D%2C%22system");
strBuf_3.append("Language%22%3A0%2C%22userLanguage%22%3A0%2C%22doNotTrack%22%");
strBuf_3.append("3Anull%2C%22msDoNotTrack%22%3A0%2C%22cookieEnabled%22%3Atrue");
strBuf_3.append("%2C%22geolocation%22%3A1%2C%22vibrate%22%3A1%2C%22maxTouchPo");
strBuf_3.append("ints%22%3A0%2C%22webdriver%22%3Atrue%2C%22plugins%22%3A%5B%2");
strBuf_3.append("2PDF%20Viewer%22%2C%22Chrome%20PDF%20Viewer%22%2C%22Chromium");
strBuf_3.append("%20PDF%20Viewer%22%2C%22Microsoft%20Edge%20PDF%20Viewer%22%2");
strBuf_3.append("C%22WebKit%20built-in%20PDF%22%5D%7D&crc=%7B%22window.chrome");
strBuf_3.append("%22%3A%7B%22app%22%3A%7B%22isInstalled%22%3Afalse%2C%22Insta");
strBuf_3.append("llState%22%3A%7B%22DISABLED%22%3A%22disabled%22%2C%22INSTALL");
strBuf_3.append("ED%22%3A%22installed%22%2C%22NOT_INSTALLED%22%3A%22not_insta");
strBuf_3.append("lled%22%7D%2C%22RunningState%22%3A%7B%22CANNOT_RUN%22%3A%22c");
strBuf_3.append("annot_run%22%2C%22READY_TO_RUN%22%3A%22ready_to_run%22%2C%22");
strBuf_3.append("RUNNING%22%3A%22running%22%7D%7D%7D%7D&t=7f2365eedfc9c7cda59");
strBuf_3.append("e852d71aef7213ec972d3&u=f98b330e1b0c52c685ee2d473e01bd7e&nap");
strBuf_3.append("=21321144241322243122");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1ECF7CFF6CF1460D465E53465666464", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CF14A7D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=0&tt=0\";_gcl_au=1.1.294711541.1656522720;_ga=GA1.2.557129673.1656522721;_gid=GA1.2.688085649.1656522721", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_130 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_63", null, 0, false);
	subContainer_49.addSubInstruction(sub_130);
		ISubRule sub_131 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_63", null, 0, false);
	subContainer_49.addSubInstruction(sub_131);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEEDABD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEC641D465E53465666464"), 3);		
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
			"A1ECF7CFF6CF14AAD465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CF3B70D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=0&tt=0\";_gcl_au=1.1.294711541.1656522720;_ga=GA1.2.557129673.1656522721;_gid=GA1.2.688085649.1656522721", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_132 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_62", null, 0, false);
	subContainer_50.addSubInstruction(sub_132);
		ISubRule sub_133 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_62", null, 0, false);
	subContainer_50.addSubInstruction(sub_133);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEEDABD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEC641D465E53465666464"), 3);		
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
			"A1ECF7CFF6CF3B73D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CF8990D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1973", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=0&tt=0\";_gcl_au=1.1.294711541.1656522720;_ga=GA1.2.557129673.1656522721;_gid=GA1.2.688085649.1656522721", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_134 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_61", null, 0, false);
	subContainer_51.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_61", null, 0, false);
	subContainer_51.addSubInstruction(sub_135);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEEDABD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEC641D465E53465666464"), 3);		
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
			"A1ECF7CFF6CF8993D465E53465666464",
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
strBuf_4.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_4.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_4.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_4.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2719300,1920,1040,19");
strBuf_4.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_4.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.08121123");
strBuf_4.append("440,828261359649.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_4.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_4.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_4.append("1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,");
strBuf_4.append("310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,");
strBuf_4.append("0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,0,1,1294,604,54;1,1");
strBuf_4.append(",1329,607,58;2,1,1366,612,75;3,1,1428,615,85;4,1,3074,618,93");
strBuf_4.append(";5,3,3076,618,93,310;-1,2,-94,-117,-1,2,-94,-111,0,797,-1,-1");
strBuf_4.append(",-1;-1,2,-94,-109,0,796,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,");
strBuf_4.append("-114,-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com");
strBuf_4.append("/-1,2,-94,-115,1,15754,32,797,796,0,17315,3076,0,16565227192");
strBuf_4.append("99,147,17721,0,6,2953,1,0,3078,13160,0,3B38199BDE94057FD0DC9");
strBuf_4.append("1B16F184356~-1~YAAQjPo7F1U7MmSBAQAA/sNysAjSfv1AYAbv3EYGJkQMz");
strBuf_4.append("uKxj7R2DHMtCTpitrE6BXnS9sjyk6VEaolMx5uHKz8TPKS67wDmPz1Z+nRoF");
strBuf_4.append("5131XugJto/85+/U0vRgIIBNvCzcJO6fazxURTTQHgeW34NAHP2h6VJdIAjf");
strBuf_4.append("R80BjeQA8rUvhPRqDM9Jbz4UAhaDrw4l+UA4sonQVmKVnEBiOQyu05Z/L2OT");
strBuf_4.append("7ap06FrfnooCBLNJiw34mJ9y13z3P9343WpgyTnGpp2P95AojGXJnLdoabCI");
strBuf_4.append("Qh4NMr+zYurYQf5asby9tLZk2vL27E9OcsV2dNXI3H63Z3x5tF6NSOxaqt6g");
strBuf_4.append("FF32HWQH35uu/zf9tugTO2l6608iP5crV9VgLCLSNa3GOtv7VuYa6kBLsiC~");
strBuf_4.append("-1~||1-wnRTWnUmZY-1-10-1000-2||~-1,38494,180,2092719767,3026");
strBuf_4.append("1693,PiZtE,28681,24,14,true-1,2,-94,-106,1,2-1,2,-94,-119,-1");
strBuf_4.append("-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,");
strBuf_4.append("-94,-126,-1,2,-94,-127,21321144241322243122-1,2,-94,-70,2737");
strBuf_4.append("20021;-851345892;dis;,7;true;true;true;-60;true;24;24;true;f");
strBuf_4.append("alse;-1-1,2,-94,-80,5372-1,2,-94,-116,8157924-1,2,-94,-118,1");
strBuf_4.append("08226-1,2,-94,-129,,,769baa1e58c97f68e09ccec638eeebbd0063964");
strBuf_4.append("4b5049f8a3ec95a8672a5b0cb,,,,0-1,2,-94,-121,;5;20;0\"}");
String requestData_4 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1ECF7CFF6CF89F0D465E53465666464", postData, requestData_4, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CFB101D465E53465666464", getHTTPTest());
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
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_136 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_60", null, 0, false);
	subContainer_52.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[2], false, "Host_60", null, 0, false);
	subContainer_52.addSubInstruction(sub_137);
	


		
				
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
			"A1ECF7CFF6CFB104D465E53465666464",
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

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CFD7E5D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2877", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=0&tt=0\";_gcl_au=1.1.294711541.1656522720;_ga=GA1.2.557129673.1656522721;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_138 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_59", null, 0, false);
	subContainer_53.addSubInstruction(sub_138);
		ISubRule sub_139 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_59", null, 0, false);
	subContainer_53.addSubInstruction(sub_139);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CF8990D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEEDABD465E53465666464"), 3);		
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
			"A1ECF7CFF6CFD7E8D465E53465666464",
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
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_5.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_5.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_5.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2719300,1920,1040,19");
strBuf_5.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_5.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.01619690");
strBuf_5.append("58,828261359649.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;1");
strBuf_5.append("0.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_5.append("/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-1");
strBuf_5.append(",2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,3");
strBuf_5.append("10,0;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0");
strBuf_5.append(",0,-1,310,1;-1,2,-94,-108,0,1,3575,-2,0,0,310;1,3,4201,-2,0,");
strBuf_5.append("0,310;2,2,4214,-2,0,0,310;3,1,4217,-2,0,0,310;4,3,4222,-2,0,");
strBuf_5.append("0,310;5,2,4234,-2,0,0,310;6,1,4236,-2,0,0,310;7,3,4240,-2,0,");
strBuf_5.append("0,310;8,2,4249,-2,0,0,310;9,1,4251,-2,0,0,310;10,3,4252,-2,0");
strBuf_5.append(",0,310;11,2,4259,-2,0,0,310;12,1,4262,-2,0,0,310;13,3,4263,-");
strBuf_5.append("2,0,0,310;14,2,4364,-2,0,0,310;-1,2,-94,-110,0,1,1294,604,54");
strBuf_5.append(";1,1,1329,607,58;2,1,1366,612,75;3,1,1428,615,85;4,1,3074,61");
strBuf_5.append("8,93;5,3,3076,618,93,310;6,4,3091,618,93,310;7,2,3488,618,93");
strBuf_5.append(",310;8,1,3510,617,93;-1,2,-94,-117,-1,2,-94,-111,0,797,-1,-1");
strBuf_5.append(",-1;-1,2,-94,-109,0,796,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,");
strBuf_5.append("-114,-1,2,-94,-103,-1,2,-94,-112,https://www.officedepot.com");
strBuf_5.append("/-1,2,-94,-115,67795,28003,32,797,796,0,97358,4993,0,1656522");
strBuf_5.append("719299,147,17721,15,9,2953,2,0,4996,86288,0,3B38199BDE94057F");
strBuf_5.append("D0DC91B16F184356~-1~YAAQjPo7F1w7MmSBAQAAPc1ysAhFins/rrxiIdlz");
strBuf_5.append("XERlBZCfiMExiOcVoMgC/K4XuW0vmuyKT/NWSzYdG1r2Tmg8SOfIDIJGIghQ");
strBuf_5.append("qIrzSHV4jrNcRlq87y3vYFB+FGbOxUapQ3O/lamdMvTCUS4gsQqS4sQ8IY1q");
strBuf_5.append("7VhABwosfe8rFfwHsFNsBch9qD9NOQaQJ5fLmHcHO6Dg2cxjA8Z3lfpGXu36");
strBuf_5.append("0Lb8M9MrOnYyfj1mTSoHRRVeBrzEiR6eEa+gCFcrxhar7yUg+EZR3bUmZNdP");
strBuf_5.append("vGVEtPkSaVwAbOTTYcPgFOrxOFVlZzv/wya3JytQ3109KOaTGAPSWN5cRNfE");
strBuf_5.append("K/VPeqKt1/801fF0gxbDNuNSjnZeMxAR/eOXvpkwd4tBDfCP2KxGTkHO7Gix");
strBuf_5.append("SeRv~-1~||1-wnRTWnUmZY-1-10-1000-2||~-1,39665,180,2092719767");
strBuf_5.append(",30261693,PiZtE,24145,95,14,true-1,2,-94,-106,8,3-1,2,-94,-1");
strBuf_5.append("19,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,");
strBuf_5.append("0.b4e88d383c7b7,0.131dd1701207c,0.4a9ef7a7b6181,0.0bae2331d1");
strBuf_5.append("ca3,0.9516353cb2efa,0.319232aed94f,0.3cc5dc2eedae7,0.4376990");
strBuf_5.append("2e3bcc,0.37c27732d2237,0.528708119c402;2,1,1,6,2,1,2,0,1,0;0");
strBuf_5.append(",0,1,15,9,0,4,1,2,1;3B38199BDE94057FD0DC91B16F184356,1656522");
strBuf_5.append("719299,wnRTWnUmZY,3B38199BDE94057FD0DC91B16F1843561656522719");
strBuf_5.append("299wnRTWnUmZY,1,1,0.b4e88d383c7b7,3B38199BDE94057FD0DC91B16F");
strBuf_5.append("1843561656522719299wnRTWnUmZY10.b4e88d383c7b7,66,172,37,156,");
strBuf_5.append("73,75,190,193,230,138,142,17,169,212,121,81,210,134,6,160,71");
strBuf_5.append(",214,159,87,62,227,193,12,21,155,5,120,584,0,1656522724292;-");
strBuf_5.append("1,2,-94,-126,-1,2,-94,-127,21321144241322243122-1,2,-94,-70,");
strBuf_5.append("273720021;-851345892;dis;,7;true;true;true;-60;true;24;24;tr");
strBuf_5.append("ue;false;-1-1,2,-94,-80,5372-1,2,-94,-116,8157924-1,2,-94,-1");
strBuf_5.append("18,159125-1,2,-94,-129,,,769baa1e58c97f68e09ccec638eeebbd006");
strBuf_5.append("39644b5049f8a3ec95a8672a5b0cb,,,,0-1,2,-94,-121,;8;20;0\"}");
String requestData_5 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1ECF7CFF6CFD845D465E53465666464", postData, requestData_5, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6CFFF14D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=0&tt=0\";_gcl_au=1.1.294711541.1656522720;_ga=GA1.2.557129673.1656522721;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_140 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_58", null, 0, false);
	subContainer_54.addSubInstruction(sub_140);
		ISubRule sub_141 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_58", null, 0, false);
	subContainer_54.addSubInstruction(sub_141);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CFD7E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEEDABD465E53465666464"), 3);		
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
			"A1ECF7CFF6CFFF17D465E53465666464",
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

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6D04D4BD465E53465666464", getHTTPTest());
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
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_142 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_57", null, 0, false);
	subContainer_55.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[2], false, "Host_57", null, 0, false);
	subContainer_55.addSubInstruction(sub_143);
	


		
				
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
			"A1ECF7CFF6D04D4ED465E53465666464",
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

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6D1D380D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2630", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=0&tt=0\";_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522724.60;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_144 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_56", null, 0, false);
	subContainer_56.addSubInstruction(sub_144);
		ISubRule sub_145 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_56", null, 0, false);
	subContainer_56.addSubInstruction(sub_145);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CFD7E5D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6CEEDABD465E53465666464"), 3);		
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
			"A1ECF7CFF6D1D383D465E53465666464",
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
strBuf_6.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_6.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_6.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_6.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2719300,1920,1040,19");
strBuf_6.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_6.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.12223806");
strBuf_6.append("261,828261359649.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;");
strBuf_6.append("10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrom");
strBuf_6.append("e/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-");
strBuf_6.append("1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,");
strBuf_6.append("310,0;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,");
strBuf_6.append("0,0,-1,310,1;-1,2,-94,-108,0,1,3575,-2,0,0,310;1,3,4201,-2,0");
strBuf_6.append(",0,310;2,2,4214,-2,0,0,310;3,1,4217,-2,0,0,310;4,3,4222,-2,0");
strBuf_6.append(",0,310;5,2,4234,-2,0,0,310;6,1,4236,-2,0,0,310;7,3,4240,-2,0");
strBuf_6.append(",0,310;8,2,4249,-2,0,0,310;9,1,4251,-2,0,0,310;10,3,4252,-2,");
strBuf_6.append("0,0,310;11,2,4259,-2,0,0,310;12,1,4262,-2,0,0,310;13,3,4263,");
strBuf_6.append("-2,0,0,310;14,2,4364,-2,0,0,310;-1,2,-94,-110,0,1,1294,604,5");
strBuf_6.append("4;1,1,1329,607,58;2,1,1366,612,75;3,1,1428,615,85;4,1,3074,6");
strBuf_6.append("18,93;5,3,3076,618,93,310;6,4,3091,618,93,310;7,2,3488,618,9");
strBuf_6.append("3,310;8,1,3510,617,93;9,1,5238,771,46;10,1,5557,769,75;11,1,");
strBuf_6.append("5830,764,87;12,1,5982,761,87;13,3,6175,761,87,-1;-1,2,-94,-1");
strBuf_6.append("17,-1,2,-94,-111,0,797,-1,-1,-1;-1,2,-94,-109,0,796,-1,-1,-1");
strBuf_6.append(",-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112");
strBuf_6.append(",https://www.officedepot.com/-1,2,-94,-115,67795,61055,32,79");
strBuf_6.append("7,796,0,130410,6175,0,1656522719299,147,17721,15,14,2953,3,0");
strBuf_6.append(",6181,115070,0,3B38199BDE94057FD0DC91B16F184356~-1~YAAQjPo7F");
strBuf_6.append("3w7MmSBAQAArtRysAhBldaB0XQgezxBLaxY8UmMZ+OaRwZG2hAp9YgbSNaEK");
strBuf_6.append("9Y0quM0tcU+433PIpjXR0p6/X9bzyv8ti7+mBfnls9QXswiZckHOuGIlgNY7");
strBuf_6.append("UpcZs1BI8HZHLyQ/MqrcoS0DQGUUQUVrFHaTyehktvnpvObo0WVKy6uScOma");
strBuf_6.append("Jd5TSS740P+kjU6MX/rSOmWv1MBINm9dFiNoe3s/pQwFW35r61w6UPvFizM8");
strBuf_6.append("ssuutgmU96r+Lm7FvXL30Z/KQbW3+zzs0dGzm/i7v7tK1HRhihfQZGKtra2z");
strBuf_6.append("2qTd83/HoFgqP0pC+61rTeUU0iY2gxfeJyOcr5u2l9VqkC9xfoE8Pv9oq48N");
strBuf_6.append("ksYe7KMo+3PBcBXt8nON5PjJeX1o3YgMy6k~-1~||-1||~-1,37815,180,2");
strBuf_6.append("092719767,30261693,PiZtE,56347,105,14,true-1,2,-94,-106,1,4-");
strBuf_6.append("1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2");
strBuf_6.append(",-94,-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322243122-1");
strBuf_6.append(",2,-94,-70,273720021;-851345892;dis;,7;true;true;true;-60;tr");
strBuf_6.append("ue;24;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116,8157924");
strBuf_6.append("-1,2,-94,-118,130052-1,2,-94,-129,33c6f54e72ed2196a148f981eb");
strBuf_6.append("3a5bd51bb6639069e41454a91411e89e70f64e,1,769baa1e58c97f68e09");
strBuf_6.append("ccec638eeebbd00639644b5049f8a3ec95a8672a5b0cb,Google Inc. (I");
strBuf_6.append("ntel),ANGLE (Intel, Intel(R) UHD Graphics 630 Direct3D11 vs_");
strBuf_6.append("5_0 ps_5_0, D3D11),95f5b71fe531f867faa814bdd4050dd8057206d53");
strBuf_6.append("ecec1163523560525884870,33-1,2,-94,-121,;10;20;0\"}");
String requestData_6 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1ECF7CFF6D1FAE7D465E53465666464", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(1440, 1, parent, parent, "A1ECF7CFF6DF8F20D465E53465666464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Great Deals on Paper - Office Depot &amp; OfficeMax", "A1ECF7CFF6DF8F20D465E53465666464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(8, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_57(this, true, "A1ECF7CFF6DF6810D465E53465666464", true, false,
						"Config_4", "/catalog/search.do?Ntt=paper",	"/catalog/search.do?Ntt=paper", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_58(this, false, "A1ECF7CFF6FE61C0D465E53465666464", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_59(this, false, "A1ECF7CFF6FEAFE1D465E53465666464", true, true,
						"Config_4", "/a/browse/paper/N=5+530715/?hijack=paper&type=Search",	"/a/browse/paper/N=5+530715/?hijack=paper&type=Search", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_60(this, false, "A1ECF7CFF7005D90D465E53465666464", false, false,
						"Config_4", "/js/od/intersectionObserver.min.2b1f47f53d.js",	"/js/od/intersectionObserver.min.2b1f47f53d.js", true, false), 173, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(4, request_61(this, false, "A1ECF7CFF702F5A0D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 385, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(5, request_62(this, false, "A1ECF7CFF7036AF8D465E53465666464", true, false,
						"Config_4", "/images/us/od/storefronts/copy_printer_paper_150x150.png",	"/images/us/od/storefronts/copy_printer_paper_150x150.png", true, false), 399, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(6, request_63(this, false, "A1ECF7CFF703B917D465E53465666464", false, false,
						"Config_4", "/images/us/od/storefronts/photo-presentation_paper_storefront.png",	"/images/us/od/storefronts/photo-presentation_paper_storefront.png", true, false), 386, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(3, request_64(this, false, "A1ECF7CFF7005D90D465E53465666464", false, false,
						"Config_4", "/images/us/od/storefronts/filler_graph_paper_150x150.png",	"/images/us/od/storefronts/filler_graph_paper_150x150.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_65(this, false, "A1ECF7CFF7005D90D465E53465666464", true, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=2&cachebuster=1462083259",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=2&cachebuster=1462083259", true, false), 1842, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(6, request_66(this, false, "A1ECF7CFF703B917D465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 2014, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(7, request_67(this, false, "A1ECF7CFF7047C41D465E53465666464", true, false,
						"Config_6", "/services/predictsearch-service/api/2/;jsessionid=0000vyAcMtZ8jaXfdIZl3fzVQI6:17h4h7dlm?searchTerm=paper",	"/services/predictsearch-service/api/2/;jsessionid=0000vyAcMtZ8jaXfdIZl3fzVQI6:17h4h7dlm?searchTerm=paper", true, false), 16, 100, "A1ECF7CFF704076FD465E53465666464", 3);
				httpParallel.addRequest(6, request_68(this, false, "A1ECF7CFF703B917D465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 3090, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(1, request_69(this, false, "A1ECF7CFF6FE61C0D465E53465666464", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 3295, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
				httpParallel.addRequest(6, request_70(this, false, "A1ECF7CFF703B917D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 3675, 100, "A1ECF7CFF6FEAFEFD465E53465666464", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6DF8F24D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522724.60;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Location_1", dcVars[40], ".*", 1, 0, 0, 0, false, "Location_4", null, 0, false);
	IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_146 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_55", null, 0, false);
	subContainer_57.addSubInstruction(sub_146);
		ISubRule sub_147 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_55", null, 0, false);
	subContainer_57.addSubInstruction(sub_147);
	


		
				
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
			"A1ECF7CFF6DF8F27D465E53465666464",
			true,
			false
		);
		
		req.setExpectedResponseCode(301);
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

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6FE61CED465E53465666464", getHTTPTest());
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
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_148 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_54", null, 0, false);
	subContainer_58.addSubInstruction(sub_148);
		ISubRule sub_149 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_54", null, 0, false);
	subContainer_58.addSubInstruction(sub_149);
	


		
				
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
			"A1ECF7CFF6FE61D1D465E53465666464",
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
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("id=d368abb8-5ad9-4036-ae24-7c950e729a8c&tagId=11024&fullRefe");
strBuf_7.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2F&payload=%7B%22s");
strBuf_7.append("itePage%22%3A%7B%22enterpriseId%22%3A%221523082%22%2C%22cart");
strBuf_7.append("Subtotal%22%3A%220%22%2C%22trackingSource%22%3A%22gtm%22%2C%");
strBuf_7.append("22pageType%22%3A%22N%2FA%22%2C%22%22%3A%7B%22userId%22%3A%22");
strBuf_7.append("%22%2C%22emailHash%22%3A%22%22%2C%22marketing_channel%22%3A%");
strBuf_7.append("22In%20Progress%22%7D%7D%7D&isDeviceAccessGranted=false&cjUs");
strBuf_7.append("er=00000000-0000-0000-0000-000000000000&cookies=");
String requestData_7 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1ECF7CFF6FE622AD465E53465666464", postData, requestData_7, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF6FEAFEFD465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522724.60;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt\";_scid=2edf1713-78e6-45dc-9544-365722deda0b", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[41], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[42], " href=\"(.*?)\"", 398, 398, 0, 0, false, "href_13", null, 0, false);
	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[43], " src=\"(.*?)\"", 62, 41, 0, 0, false, "src_18", null, 0, false);
	IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_150 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_53", null, 0, false);
	subContainer_59.addSubInstruction(sub_150);
		ISubRule sub_151 = new SubRule("req_uri", 0, 52, false, (IDCCoreVar)dcVars[40], false, "Great Deals on Paper_url_2", null, 0, false);
	subContainer_59.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_53", null, 0, false);
	subContainer_59.addSubInstruction(sub_152);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF6FEAFF2D465E53465666464",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7005D9ED465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_153 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_52", null, 0, false);
	subContainer_60.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_uri", 0, 45, false, (IDCCoreVar)dcVars[43], false, "Great Deals on Paper_url", null, 0, false);
	subContainer_60.addSubInstruction(sub_154);
		ISubRule sub_155 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_52", null, 0, false);
	subContainer_60.addSubInstruction(sub_155);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF7005DA1D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF702F5AED465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_156 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_51", null, 0, false);
	subContainer_61.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_51", null, 0, false);
	subContainer_61.addSubInstruction(sub_157);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF7031CB0D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7036B06D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_158 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_50", null, 0, false);
	subContainer_62.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_50", null, 0, false);
	subContainer_62.addSubInstruction(sub_159);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF7036B09D465E53465666464",
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

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF703B925D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_160 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_49", null, 0, false);
	subContainer_63.addSubInstruction(sub_160);
		ISubRule sub_161 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_49", null, 0, false);
	subContainer_63.addSubInstruction(sub_161);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF703B928D465E53465666464",
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

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF703E04BD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;mt.mbsh=%7B%221656522719853%22%3A%7B%22AC1517TEST%22%3A1%2C%22AC3840TEST%22%3A1%2C%22AC7444CONTROL%22%3A1%7D%7D;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_162 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_48", null, 0, false);
	subContainer_64.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_48", null, 0, false);
	subContainer_64.addSubInstruction(sub_163);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF703E04ED465E53465666464",
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

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF704076FD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;subscriptionAIService=true;returnsResponsive=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55;mt.mbsh=%7B%221656522730466%22%3A%7B%7D%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_164 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_47", null, 0, false);
	subContainer_65.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_47", null, 0, false);
	subContainer_65.addSubInstruction(sub_165);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF7040772D465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7042E6BD465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1554", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;subscriptionAIService=true;returnsResponsive=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;RT=\"z=1&dm=officedepot.com&si=6ebgzsbgmok&ss=l4zuuszx&sl=1&tt=0&rl=1&obo=1&ld=7th&r=6270a3ca7376c496c8631362d76c9d41&ul=7tt&hd=9j5\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55;mt.mbsh=%7B%221656522730466%22%3A%7B%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_166 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_46", null, 0, false);
	subContainer_66.addSubInstruction(sub_166);
		ISubRule sub_167 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_46", null, 0, false);
	subContainer_66.addSubInstruction(sub_167);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6DF8F24D465E53465666464"), 3);		
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
			"A1ECF7CFF7042E6ED465E53465666464",
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
strBuf_8.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_8.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_8.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_8.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2731461,1920,1040,19");
strBuf_8.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_8.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.28472356");
strBuf_8.append("3142,828261365730.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,");
strBuf_8.append("dm_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;");
strBuf_8.append("0,0,0,0,-1,310,1;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,510");
strBuf_8.append("1,-1,0;0,0,0,0,-1,310,1;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94");
strBuf_8.append(",-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-10");
strBuf_8.append("3,-1,2,-94,-112,https://www.officedepot.com/a/browse/paper/N");
strBuf_8.append("=5+530715/?hijack=paper&type=Search-1,2,-94,-115,1,32,32,0,0");
strBuf_8.append(",0,0,0,0,1656522731461,-999999,17721,0,0,2953,0,0,2,0,0,3B38");
strBuf_8.append("199BDE94057FD0DC91B16F184356~-1~YAAQjPo7F8E7MmSBAQAA3+NysAiL");
strBuf_8.append("6Qdw8f1jfVg4ysKmuq9/0JJpyAeEal30bvzAczqJgJkW/3cC8sazoiwRFZ4V");
strBuf_8.append("W3K8O9vy3V262ZnS4vkXaxm7QAztC++m7Lh+bJ9VX2D61YJbO04gMfTgMSAK");
strBuf_8.append("uuvZA/jUiaj2Qo0YqJick9HLlnUCvXwTus9ICq7dRQ0pN2w2Orc/OBLue0t5");
strBuf_8.append("DDw+LFDVqH6KUWza1mRjekcENtP4IMac6lyRko6AzoU7ANTPUKncrD22f7EU");
strBuf_8.append("YFI8mLBUQeTE6jNfHB/el3y+vxaO3O0+V+ibmCwZHS+0qDUAHAkyspHcd/pb");
strBuf_8.append("c6XTF92nlNz59IekOS1hLBTiRfcoUiKVKloOetqJd72S5mlyV7tYW9KIHyAt");
strBuf_8.append("Kg41h1GK794RK9Rt~-1~-1~-1,36561,-1,-1,30261693,PiZtE,21249,6");
strBuf_8.append("3,14,true-1,2,-94,-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,");
strBuf_8.append("1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,");
strBuf_8.append("-127,8-1,2,-94,-70,-1-1,2,-94,-80,94-1,2,-94,-116,40971834-1");
strBuf_8.append(",2,-94,-118,93200-1,2,-94,-129,-1,2,-94,-121,;6;-1;0\"}");
String requestData_8 = strBuf_8.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1ECF7CFF7045530D465E53465666464", postData, requestData_8, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7047C4FD465E53465666464", getHTTPTest());
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
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_168 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_45", null, 0, false);
	subContainer_67.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[2], false, "Host_45", null, 0, false);
	subContainer_67.addSubInstruction(sub_169);
	


		
				
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
			"A1ECF7CFF7047C52D465E53465666464",
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

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF704A384D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1865", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;_ga=GA1.1.557129673.1656522721;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;_ga_MZ424N4G1Y=GS1.1.1656522724.1.0.1656522729.55;mt.mbsh=%7B%221656522730466%22%3A%7B%7D%7D;RT=\"z=1&dm=officedepot.com&si=f0k177igbx&ss=l4zuuszx&sl=1&tt=0&obo=1&rl=1\";mt.sac_1=t", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_9(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_170 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_44", null, 0, false);
	subContainer_68.addSubInstruction(sub_170);
		ISubRule sub_171 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_44", null, 0, false);
	subContainer_68.addSubInstruction(sub_171);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7042E6BD465E53465666464"), 3);		
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
			"A1ECF7CFF704A387D465E53465666464",
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
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_9 = new StringBuffer();
strBuf_9.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_9.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_9.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_9.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2731461,1920,1040,19");
strBuf_9.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_9.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.38225147");
strBuf_9.append("2191,828261365730.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_9.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_9.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_9.append("-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_9.append(",310,1;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0");
strBuf_9.append(",0,0,-1,310,1;-1,2,-94,-108,-1,2,-94,-110,0,1,631,687,316;1,");
strBuf_9.append("1,741,671,378;-1,2,-94,-117,-1,2,-94,-111,0,711,-1,-1,-1;-1,");
strBuf_9.append("2,-94,-109,0,711,-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1");
strBuf_9.append(",2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/a/brow");
strBuf_9.append("se/paper/N=5+530715/?hijack=paper&type=Search-1,2,-94,-115,1");
strBuf_9.append(",3459,32,711,711,0,4849,1081,0,1656522731461,333,17721,0,2,2");
strBuf_9.append("953,0,0,1082,2794,0,3B38199BDE94057FD0DC91B16F184356~-1~YAAQ");
strBuf_9.append("jPo7F+47MmSBAQAAofFysAjXY+Q7VGSxGOjuKWOm8dVLfXqK6HN3dyvFzDCy");
strBuf_9.append("CJjGCRsfYCO2bMOvQkWJu/nOXO6tjZlb5/Z5d4FA7zr9PVN1Z0IM7Jz7LhMR");
strBuf_9.append("3l6OwFwhV+BXwxT2n1uadUw3VVDoURcwoVZtv7Vemt2/kBokkIIo4WSgjVP2");
strBuf_9.append("r8UPE+0dzHMjNsxrPRAOlQSNa/NNtj3eWZ8agt59BcH9yJD2DonGfkn3LBtj");
strBuf_9.append("FKWGfM00klOltxU8KwZ7mcyIeXlERMkhrqDb1FKMVcvjzc2sdOg+a3A9r0CQ");
strBuf_9.append("pr4VyqKVslittX/XR6cyk7RMlybod59+Ana/q/1yQX3mzx6ank4eXuwo5v2t");
strBuf_9.append("KGxMg3L6jgnG/Af9eUNzMHNQntP4VFYuvsojtHNH~-1~-1~-1,37589,704,");
strBuf_9.append("1554041693,30261693,PiZtE,99048,67,14,true-1,2,-94,-106,9,1-");
strBuf_9.append("1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2");
strBuf_9.append(",-94,-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322243122-1");
strBuf_9.append(",2,-94,-70,273720021;-851345892;dis;,7;true;true;true;-60;tr");
strBuf_9.append("ue;24;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116,4097183");
strBuf_9.append("4-1,2,-94,-118,108243-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;2;");
strBuf_9.append("8;0\"}");
String requestData_9 = strBuf_9.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1ECF7CFF704CA60D465E53465666464", postData, requestData_9, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_8);

	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF70E8E60D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "563", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_10(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_172 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_43", null, 0, false);
	subContainer_69.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_43", null, 0, false);
	subContainer_69.addSubInstruction(sub_173);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);		
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
			"A1ECF7CFF70E8E63D465E53465666464",
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
	private void postDataClass_10(HTTPPostData postData) {
				StringBuffer strBuf_10 = new StringBuffer();
strBuf_10.append("id=f1fea756-4c68-4bf5-83d7-fe95b8feb82b&tagId=11024&fullRefe");
strBuf_10.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fa%2Fbrowse%2Fpap");
strBuf_10.append("er%2FN%3D5%2B530715%2F%3Fhijack%3Dpaper%26type%3DSearch&payl");
strBuf_10.append("oad=%7B%22sitePage%22%3A%7B%22enterpriseId%22%3A%221523082%2");
strBuf_10.append("2%2C%22cartSubtotal%22%3A%220%22%2C%22trackingSource%22%3A%2");
strBuf_10.append("2gtm%22%2C%22pageType%22%3A%22N%2FA%22%2C%22%22%3A%7B%22user");
strBuf_10.append("Id%22%3A%22%22%2C%22emailHash%22%3A%22%22%2C%22marketing_cha");
strBuf_10.append("nnel%22%3A%22In%20Progress%22%7D%7D%7D&isDeviceAccessGranted");
strBuf_10.append("=false&cjUser=00000000-0000-0000-0000-000000000000&cookies=c");
strBuf_10.append("jConsent%3DMHxZfDB8Tnww");
String requestData_10 = strBuf_10.toString();
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1ECF7CFF70E8EBCD465E53465666464", postData, requestData_10, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_9);

	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF70EB5C3D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2023", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.mbsh=%7B%221656522730466%22%3A%7B%7D%7D;RT=\"z=1&dm=officedepot.com&si=f0k177igbx&ss=l4zuuszx&sl=1&tt=0&obo=1&rl=1\";mt.sac_1=t;_ga=GA1.1.557129673.1656522721;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522732.52;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_11(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_174 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_42", null, 0, false);
	subContainer_70.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_42", null, 0, false);
	subContainer_70.addSubInstruction(sub_175);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF704A384D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF6FEAFEFD465E53465666464"), 3);		
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
			"A1ECF7CFF70EB5C6D465E53465666464",
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
strBuf_11.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_11.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_11.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_11.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2731461,1920,1040,19");
strBuf_11.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_11.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.85020558");
strBuf_11.append("3425,828261365730.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_11.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_11.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_11.append("-1,2,-94,-105,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_11.append(",310,1;-1,2,-94,-102,0,0,0,0,-1,310,1;0,-1,0,0,5101,-1,0;0,0");
strBuf_11.append(",0,0,-1,310,1;-1,-1,1,0,-1,317,0;-1,-1,1,0,-1,629,0;-1,-1,1,");
strBuf_11.append("0,-1,622,0;-1,2,-94,-108,-1,2,-94,-110,0,1,631,687,316;1,1,7");
strBuf_11.append("41,671,378;2,1,1087,699,514;3,3,1656,699,514,-1;-1,2,-94,-11");
strBuf_11.append("7,-1,2,-94,-111,0,711,-1,-1,-1;-1,2,-94,-109,0,711,-1,-1,-1,");
strBuf_11.append("-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,");
strBuf_11.append("https://www.officedepot.com/a/browse/paper/N=5+530715/?hijac");
strBuf_11.append("k=paper&type=Search-1,2,-94,-115,1,8637,32,711,711,0,10027,1");
strBuf_11.append("657,0,1656522731461,333,17721,0,4,2953,1,0,1662,5537,0,3B381");
strBuf_11.append("99BDE94057FD0DC91B16F184356~-1~YAAQjPo7F/c7MmSBAQAAsPRysAhCe");
strBuf_11.append("IBccAvfbZnprAz2zV9NxIZ/J08L7xPNHnWTrPLb76BJvxmpBQomSQRtE2Jz4");
strBuf_11.append("730JB9VAR8ZkqnDLcwOGUj5Ep0pCH8XtVUwCpEaWqGnra8EHuitRutXKvSnQ");
strBuf_11.append("Y+REkuDZ9DR7Nr1w/UO9DfurZxSf6xZgcBedY93Z4iHXBuXNLbnykguTZfvP");
strBuf_11.append("6LRmNb90qKPbyth5N4OfJvpKUrPf0WDamcLWkAHU1Wdcwyy8r7XrcsEng4AG");
strBuf_11.append("3z7hjX/IplJYdWhMQovVqzNI2efPJKIaBEDqMLLQTGdGVLjl8U1XRc917u7F");
strBuf_11.append("Yr8OZG4NQQfmXP6PyoAXeuTef6QNeBUz18ojQRf2fZeo4OuYBbQOAYHTpedc");
strBuf_11.append("QR+u9jrG+dnzj4u~-1~-1~-1,37612,704,1554041693,30261693,PiZtE");
strBuf_11.append(",15674,71,14,true-1,2,-94,-106,1,2-1,2,-94,-119,-1-1,2,-94,-");
strBuf_11.append("122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-");
strBuf_11.append("1,2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;-851");
strBuf_11.append("345892;dis;,7;true;true;true;-60;true;24;24;true;false;-1-1,");
strBuf_11.append("2,-94,-80,5372-1,2,-94,-116,40971834-1,2,-94,-118,112893-1,2");
strBuf_11.append(",-94,-129,,,769baa1e58c97f68e09ccec638eeebbd00639644b5049f8a");
strBuf_11.append("3ec95a8672a5b0cb,,,,0-1,2,-94,-121,;9;8;0\"}");
String requestData_11 = strBuf_11.toString();
			
	HTTPPostDataChunk pdc_10 = new HTTPPostDataChunk("A1ECF7CFF70EDC90D465E53465666464", postData, requestData_11, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_10);

	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(499, 1, parent, parent, "A1ECF7CFF70F03F4D465E53465666464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Notebooks &amp; Notepads | Office Depot", "A1ECF7CFF70F03F4D465E53465666464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(18, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_71(this, true, "A1ECF7CFF70F03E6D465E53465666464", true, true,
						"Config_4", "/a/browse/notebooks-and-pads/N=5+530741/",	"/a/browse/notebooks-and-pads/N=5+530741/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_72(this, false, "A1ECF7CFF6FE61C0D465E53465666464", false, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 525, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(2, request_73(this, false, "A1ECF7CFF7611B5FD465E53465666464", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=3&cachebuster=1752589657",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=3&cachebuster=1752589657", true, false), 142, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(2, request_74(this, false, "A1ECF7CFF7611B5FD465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 1992, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(2, request_75(this, false, "A1ECF7CFF7611B5FD465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 2742, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(3, request_76(this, false, "A1ECF7CFF761DED4D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 424, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(4, request_77(this, false, "A1ECF7CFF76253B0D465E53465666464", false, false,
						"Config_4", "/a/browse/writing-pads/N=5+549829/",	"/a/browse/writing-pads/N=5+549829/", true, false), 3882, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(5, request_78(this, false, "A1ECF7CFF7644F82D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 3935, 100, "A1ECF7CFF70F03F8D465E53465666464", 2);
				httpParallel.addRequest(4, request_79(this, false, "A1ECF7CFF76253B0D465E53465666464", true, false,
						"Config_4", "/styles/od/compare.min.24ed94cf7a.css",	"/styles/od/compare.min.24ed94cf7a.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_80(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/js/od/csl.min.7e5ee1ef3d.js",	"/js/od/csl.min.7e5ee1ef3d.js", true, false), 19, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(7, request_81(this, false, "A1ECF7CFF76560F0D465E53465666464", false, false,
						"Config_4", "/styles/compare_bar.min.4a2940e846b7889ce3ee.css",	"/styles/compare_bar.min.4a2940e846b7889ce3ee.css", true, false), 18, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(6, request_82(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/styles/atc_subscribtion_lightbox.min.90f1733b8dcc72e86eb0.css",	"/styles/atc_subscribtion_lightbox.min.90f1733b8dcc72e86eb0.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_83(this, false, "A1ECF7CFF76560F0D465E53465666464", false, false,
						"Config_4", "/js/od/compare.min.03e7ab0c20.js",	"/js/od/compare.min.03e7ab0c20.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_84(this, false, "A1ECF7CFF765FD83D465E53465666464", false, false,
						"Config_4", "/js/od/skuList.min.5b3cf4947a.js",	"/js/od/skuList.min.5b3cf4947a.js", true, false), 197, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(6, request_85(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/js/od/localStorageCache.min.94b4cbf9c4.js",	"/js/od/localStorageCache.min.94b4cbf9c4.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_86(this, false, "A1ECF7CFF76560F0D465E53465666464", false, false,
						"Config_4", "/js/od/search.min.fd2ba1e358.js",	"/js/od/search.min.fd2ba1e358.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_87(this, false, "A1ECF7CFF765FD83D465E53465666464", false, false,
						"Config_4", "/js/od/protectionplans.min.8cd3245391.js",	"/js/od/protectionplans.min.8cd3245391.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_88(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(9, request_89(this, false, "A1ECF7CFF7670EE7D465E53465666464", false, false,
						"Config_4", "/images/us/od/reviews/v2/5.gif",	"/images/us/od/reviews/v2/5.gif", true, false), 458, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(7, request_90(this, false, "A1ECF7CFF76560F0D465E53465666464", false, false,
						"Config_4", "/images/us/od/reviews/v2/4.gif",	"/images/us/od/reviews/v2/4.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_91(this, false, "A1ECF7CFF765FD83D465E53465666464", false, false,
						"Config_4", "/images/us/od/reviews/v2/3.gif",	"/images/us/od/reviews/v2/3.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(10, request_92(this, false, "A1ECF7CFF7678408D465E53465666464", false, false,
						"Config_4", "/images/us/od/reviews/v2/2.gif",	"/images/us/od/reviews/v2/2.gif", true, false), 548, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(11, request_93(this, false, "A1ECF7CFF767AB23D465E53465666464", false, false,
						"Config_4", "/images/us/od/reviews/v2/1.gif",	"/images/us/od/reviews/v2/1.gif", true, false), 551, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(9, request_94(this, false, "A1ECF7CFF7670EE7D465E53465666464", false, false,
						"Config_4", "/images/us/od/common/check-green-v2.png",	"/images/us/od/common/check-green-v2.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_95(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/images/us/od/common/info-blue.png",	"/images/us/od/common/info-blue.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_96(this, false, "A1ECF7CFF765FD83D465E53465666464", true, false,
						"Config_4", "/images/us/od/icon_same_day_delivery.png",	"/images/us/od/icon_same_day_delivery.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_97(this, false, "A1ECF7CFF76560F0D465E53465666464", true, false,
						"Config_4", "/images/us/od/common/eco_concious.jpg",	"/images/us/od/common/eco_concious.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(10, request_98(this, false, "A1ECF7CFF7678408D465E53465666464", true, false,
						"Config_4", "/images/us/od/common/eco_concious_recycle.jpg",	"/images/us/od/common/eco_concious_recycle.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(11, request_99(this, false, "A1ECF7CFF767AB23D465E53465666464", true, false,
						"Config_4", "/js/compare_bar.min.1b1cbd6e846d1fd8a95a.js",	"/js/compare_bar.min.1b1cbd6e846d1fd8a95a.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(9, request_100(this, false, "A1ECF7CFF7670EE7D465E53465666464", true, false,
						"Config_4", "/js/atc_subscribtion_lightbox.min.05c42a9f3db82916891b.js",	"/js/atc_subscribtion_lightbox.min.05c42a9f3db82916891b.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_101(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=8&cachebuster=1556760602",	"/tag_path/profile/visit/js/1_0?dtm_cid=2206&dtm_cmagic=fea9c1&dtm_fid=101&dtm_promo_id=8&cachebuster=1556760602", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_102(this, false, "A1ECF7CFF6FE61C0D465E53465666464", true, false,
						"Config_4", "/proxy/mczbf/11024/pageInfo",	"/proxy/mczbf/11024/pageInfo", true, false), 2372, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(6, request_103(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/js/sponsoredskus.chunk.min.0a16022d03cc65ca69aa.js",	"/js/sponsoredskus.chunk.min.0a16022d03cc65ca69aa.js", true, false), 2728, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(12, request_104(this, false, "A1ECF7CFF77E8E40D465E53465666464", true, false,
						"Config_5", "/compare-bar/static/css/main.css",	"/compare-bar/static/css/main.css", true, false), 37, 100, "A1ECF7CFF77DF200D465E53465666464", 3);
				httpParallel.addRequest(13, request_105(this, false, "A1ECF7CFF77EB59BD465E53465666464", true, false,
						"Config_5", "/compare-bar/static/css/global.css",	"/compare-bar/static/css/global.css", true, false), 48, 100, "A1ECF7CFF77DF200D465E53465666464", 3);
				httpParallel.addRequest(14, request_106(this, false, "A1ECF7CFF77F5193D465E53465666464", true, false,
						"Config_5", "/subscription-lightbox/static/css/main.css",	"/subscription-lightbox/static/css/main.css", true, false), 46, 100, "A1ECF7CFF77DF200D465E53465666464", 3);
				httpParallel.addRequest(15, request_107(this, false, "A1ECF7CFF77FEDD3D465E53465666464", true, false,
						"Config_5", "/subscription-lightbox/static/css/global.css",	"/subscription-lightbox/static/css/global.css", true, false), 39, 100, "A1ECF7CFF77DF200D465E53465666464", 3);
				httpParallel.addRequest(16, request_108(this, false, "A1ECF7CFF7801523D465E53465666464", true, false,
						"Config_5", "/compare-bar/static/js/main.js",	"/compare-bar/static/js/main.js", true, false), 39, 100, "A1ECF7CFF77DF200D465E53465666464", 3);
				httpParallel.addRequest(17, request_109(this, false, "A1ECF7CFF7812650D465E53465666464", true, false,
						"Config_5", "/subscription-lightbox/static/js/main.js",	"/subscription-lightbox/static/js/main.js", true, false), 47, 100, "A1ECF7CFF77DF200D465E53465666464", 3);
				httpParallel.addRequest(6, request_110(this, false, "A1ECF7CFF76512D1D465E53465666464", false, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 3578, 100, "A1ECF7CFF76253BED465E53465666464", 2);
				httpParallel.addRequest(6, request_111(this, false, "A1ECF7CFF76512D1D465E53465666464", true, false,
						"Config_4", "/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo",	"/7X4EJMz7xK38/0gNY2M/VA1ygN/uOuapwGt/NF0eYBMRMgs/HQFje/jFRalo", true, false), 4189, 100, "A1ECF7CFF76253BED465E53465666464", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF70F03F8D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/paper/N=5+530715/?hijack=paper&type=Search", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;BVBRANDSID=c8bbe092-d5f5-4274-9f85-2c6d5d729bdc;BVBRANDID=88d9c488-06d7-487a-bfe4-ae1b452fbe69;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.mbsh=%7B%221656522730466%22%3A%7B%7D%7D;mt.sac_1=t;_ga=GA1.1.557129673.1656522721;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522732.52;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;mt.pevt=mr%3Dt1655097818%26mi%3D'5.268323929.1656522714668'%26u%3D'https%3A%2F%2Fwww.officedepot.com%2Fa%2Fbrowse%2Fpaper%2FN%253D5%252B530715%2F%253Fhijack%253Dpaper%2526type%253DSearch'%26e%3D!(xi)%26ii%3D!('5%2C1%2C3697948%2Cop_impression%2C%2C%2C%2C%2C1656522731%2C0%2C1656522731')%26eoq%3D!t;RT=\"z=1&dm=officedepot.com&si=f0k177igbx&ss=l4zuuszx&sl=2&tt=51d&obo=1&rl=1&nu=11b14bcb60d4c08486d0076f8c554b5f&cl=ctm&ld=cv9&r=8c81c2c47a9e7dc9fcaf8b14289c4489&ul=cvf\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[44], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[45], " href=\"(.*?)\"", 399, 399, 0, 0, false, "href_14", null, 0, false);
	IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_176 = new SubRule("req_hdr_Referer_1", 0, 79, false, (IDCCoreVar)dcVars[41], false, "Referer_41", null, 0, false);
	subContainer_71.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[42], false, "Notebooks &amp; Note_url_13", null, 0, false);
	subContainer_71.addSubInstruction(sub_177);
		ISubRule sub_178 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_41", null, 0, false);
	subContainer_71.addSubInstruction(sub_178);
	


		
				
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
			"A1ECF7CFF70F03FBD465E53465666464",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF760CD10D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "543", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_12(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_179 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_40", null, 0, false);
	subContainer_72.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_40", null, 0, false);
	subContainer_72.addSubInstruction(sub_180);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF760CD13D465E53465666464",
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
	private void postDataClass_12(HTTPPostData postData) {
				StringBuffer strBuf_12 = new StringBuffer();
strBuf_12.append("id=1412b1fb-1b88-4c1e-a179-9d836922bec8&tagId=11024&fullRefe");
strBuf_12.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fa%2Fbrowse%2Fnot");
strBuf_12.append("ebooks-and-pads%2FN%3D5%2B530741%2F&payload=%7B%22sitePage%2");
strBuf_12.append("2%3A%7B%22enterpriseId%22%3A%221523082%22%2C%22cartSubtotal%");
strBuf_12.append("22%3A%220%22%2C%22trackingSource%22%3A%22gtm%22%2C%22pageTyp");
strBuf_12.append("e%22%3A%22N%2FA%22%2C%22%22%3A%7B%22userId%22%3A%22%22%2C%22");
strBuf_12.append("emailHash%22%3A%22%22%2C%22marketing_channel%22%3A%22In%20Pr");
strBuf_12.append("ogress%22%7D%7D%7D&isDeviceAccessGranted=false&cjUser=000000");
strBuf_12.append("00-0000-0000-0000-000000000000&cookies=cjConsent%3DMHxZfDB8T");
strBuf_12.append("nww");
String requestData_12 = strBuf_12.toString();
			
	HTTPPostDataChunk pdc_11 = new HTTPPostDataChunk("A1ECF7CFF760F46CD465E53465666464", postData, requestData_12, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_11);

	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7611B6DD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.mbsh=%7B%221656522730466%22%3A%7B%7D%7D;mt.sac_1=t;_ga=GA1.1.557129673.1656522721;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;BVBRANDID=61f5698b-aae7-4043-9078-2cb878a84c03;BVBRANDSID=eb82d432-00fd-48f9-acbf-4df4470a046c;RT=\"z=1&dm=officedepot.com&si=f0k177igbx&ss=l4zuuszx&sl=2&tt=51d&obo=1&rl=1&nu=11b14bcb60d4c08486d0076f8c554b5f&cl=ctm&ld=cv9&r=8c81c2c47a9e7dc9fcaf8b14289c4489&ul=cvf&hd=dhm\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522734.50", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_181 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_39", null, 0, false);
	subContainer_73.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_39", null, 0, false);
	subContainer_73.addSubInstruction(sub_182);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7611B70D465E53465666464",
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

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7611C0CD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;BVBRANDID=61f5698b-aae7-4043-9078-2cb878a84c03;BVBRANDSID=eb82d432-00fd-48f9-acbf-4df4470a046c;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=2&tt=51d&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522736.48;_ga=GA1.1.557129673.1656522721;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_183 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_38", null, 0, false);
	subContainer_74.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_38", null, 0, false);
	subContainer_74.addSubInstruction(sub_184);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7611C0FD465E53465666464",
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

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF76190A7D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1541", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_pin_unauth=dWlkPU5EQmtNMlF3WXpRdFlqY3pZaTAwTnpkbUxXSmxZV0V0TmpoaVpUZGlaalJpTTJGbQ;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;BVBRANDID=61f5698b-aae7-4043-9078-2cb878a84c03;BVBRANDSID=eb82d432-00fd-48f9-acbf-4df4470a046c;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=2&tt=51d&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522736.48;_ga=GA1.1.557129673.1656522721;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_13(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_185 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_37", null, 0, false);
	subContainer_75.addSubInstruction(sub_185);
		ISubRule sub_186 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_37", null, 0, false);
	subContainer_75.addSubInstruction(sub_186);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF761B770D465E53465666464",
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
	private void postDataClass_13(HTTPPostData postData) {
				StringBuffer strBuf_13 = new StringBuffer();
strBuf_13.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_13.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_13.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_13.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2737347,1920,1040,19");
strBuf_13.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_13.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.09552994");
strBuf_13.append("247,828261368673.5,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,d");
strBuf_13.append("m_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0");
strBuf_13.append(",0,0,0,-1,310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101");
strBuf_13.append(",-1,0;0,0,0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94,");
strBuf_13.append("-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-103");
strBuf_13.append(",-1,2,-94,-112,https://www.officedepot.com/a/browse/notebook");
strBuf_13.append("s-and-pads/N=5+530741/-1,2,-94,-115,1,32,32,0,0,0,0,1,0,1656");
strBuf_13.append("522737347,-999999,17721,0,0,2953,0,0,3,0,0,3B38199BDE94057FD");
strBuf_13.append("0DC91B16F184356~-1~YAAQjPo7FwY8MmSBAQAABvdysAgkIXqYYpMxgvc9V");
strBuf_13.append("tIjCI2U939MQnwsnypQ00X0Qx7to8O/ziHd7QrvNhBpJO1xBFrbWOADC46Cj");
strBuf_13.append("owVcLG0Ck+k0KAlS8AbP8CSUlvqQuh1kXlsYopsNZFQCSdFyeAFHEs2eKRCV");
strBuf_13.append("2peqeUpzmL7hmLW7QWrJJZtUyvCl2YECVs2fEJl5AYdKJrfG1TJB19QQaYHX");
strBuf_13.append("huG6wgtW+n5Pg8Usxpw96hA55ydaE46/v5JfyQDp9qN8SJZNG+k/eQKTsLxf");
strBuf_13.append("ULHtsIX6Xk4cwx0t0VfnKbqvHT8WcIS9QhcbMjxP4wlB0RaUx64xQt/TuI/A");
strBuf_13.append("JXI9qyXzbwAKCrNhLmkteUN1bALxffWAUV2mDy6jumuptHfvKAd9/iONUajL");
strBuf_13.append("feJ~-1~-1~-1,37661,-1,-1,30261693,PiZtE,49062,69,14,true-1,2");
strBuf_13.append(",-94,-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2");
strBuf_13.append(",-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-9");
strBuf_13.append("4,-70,-1-1,2,-94,-80,94-1,2,-94,-116,41060037-1,2,-94,-118,9");
strBuf_13.append("3136-1,2,-94,-129,-1,2,-94,-121,;6;-1;0\"}");
String requestData_13 = strBuf_13.toString();
			
	HTTPPostDataChunk pdc_12 = new HTTPPostDataChunk("A1ECF7CFF761B7CDD465E53465666464", postData, requestData_13, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_12);

	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF761DEE2D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1785", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;BVBRANDSID=eb82d432-00fd-48f9-acbf-4df4470a046c;BVBRANDID=61f5698b-aae7-4043-9078-2cb878a84c03;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=2&tt=51d&obo=1&rl=1\";_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522736.48;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_14(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_187 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_36", null, 0, false);
	subContainer_76.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_36", null, 0, false);
	subContainer_76.addSubInstruction(sub_188);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76190A7D465E53465666464"), 3);		
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
			"A1ECF7CFF761DEE5D465E53465666464",
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
strBuf_14.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_14.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_14.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_14.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2737347,1920,1040,19");
strBuf_14.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_14.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.98102740");
strBuf_14.append("5490,828261368673.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_14.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_14.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_14.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_14.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0");
strBuf_14.append(",0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,0,3,627,699,514,-1");
strBuf_14.append(";-1,2,-94,-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,");
strBuf_14.append("2,-94,-103,-1,2,-94,-112,https://www.officedepot.com/a/brows");
strBuf_14.append("e/notebooks-and-pads/N=5+530741/-1,2,-94,-115,1,1875,32,0,0,");
strBuf_14.append("0,1843,627,0,1656522737347,18,17721,0,1,2953,1,0,646,627,0,3");
strBuf_14.append("B38199BDE94057FD0DC91B16F184356~-1~YAAQjPo7F3I8MmSBAQAAdAdzs");
strBuf_14.append("AjTnnwAqyWNQYL1FvxuMOkTKoipGjZtdU8I7HcTLnuZMwlA7uhOtDZZXp8Ry");
strBuf_14.append("m5mexjHdjh0azW1N1SDg068Mi2wRM0vOZQFMJODxV+6LRbAMksStAndRZmov");
strBuf_14.append("rEUyVJNHDlgHh1qxAw6MjAf4YAMH8jwvWrM2KqHWHwDk0+smQqtIhs6ISssv");
strBuf_14.append("8ltZ8VB51y4gKjxHijy45netNIRqL5Spzh1wLElNlqas4j9uol7LDqdTH1LP");
strBuf_14.append("7Fg9hrFNDOerY2MbgoBWhpsz6mMBLG6N+H3TS5hoIuUtIoe8YJXD+PwHlIRA");
strBuf_14.append("x6VQyYzfBr8h/Gn/flEB6GG9EIL06DWUUaf1BIBolqdXVb6CVrI9fhl7Bb0U");
strBuf_14.append("JaiaJ60ixWj6nczmovm~-1~-1~-1,37726,399,1434967563,30261693,P");
strBuf_14.append("iZtE,28082,51,14,true-1,2,-94,-106,1,1-1,2,-94,-119,-1-1,2,-");
strBuf_14.append("94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-1");
strBuf_14.append("26,-1,2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;");
strBuf_14.append("-851345892;dis;,7;true;true;true;-60;true;24;24;true;false;-");
strBuf_14.append("1-1,2,-94,-80,5372-1,2,-94,-116,41060037-1,2,-94,-118,103885");
strBuf_14.append("-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;22;9;0\"}");
String requestData_14 = strBuf_14.toString();
			
	HTTPPostDataChunk pdc_13 = new HTTPPostDataChunk("A1ECF7CFF76205A4D465E53465666464", postData, requestData_14, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_13);

	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF76253BED465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;BVBRANDSID=eb82d432-00fd-48f9-acbf-4df4470a046c;BVBRANDID=61f5698b-aae7-4043-9078-2cb878a84c03;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522736.48;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;mt.pevt=mr%3Dt1655097818%26mi%3D'5.268323929.1656522714668'%26u%3D'https%3A%2F%2Fwww.officedepot.com%2Fa%2Fbrowse%2Fnotebooks-and-pads%2FN%253D5%252B530741%2F'%26e%3D!(xi)%26ii%3D!('5%2C1%2C3697948%2Cop_impression%2C%2C%2C%2C%2C1656522736%2C0%2C1656522737')%26eoq%3D!t;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[46], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_5", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[47], " href=\"(.*?)\"", 25, 25, 0, 0, false, "href_17", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[48], " src=\"(.*?)\"", 51, 51, 0, 0, false, "src_26", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[49], " src=\"(.*?)\"", 189, 138, 0, 0, false, "src_20", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[50], " href=\"(.*?)\"", 838, 1, 0, 0, false, "href_16", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[51], " src=\"(.*?)\"", 190, 1, 0, 0, false, "src_19", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[52], " href=\"(.*?)\"", 839, 1, 0, 0, false, "href_15", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[53], " src=\"(.*?)\"", 197, 7, 0, 0, false, "src_25", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[54], " src=\"(.*?)\"", 198, 1, 0, 0, false, "src_24", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[55], " src=\"(.*?)\"", 199, 1, 0, 0, false, "src_23", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[56], " src=\"(.*?)\"", 200, 1, 0, 0, false, "src_22", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[57], " src=\"(.*?)\"", 201, 1, 0, 0, false, "src_21", null, 0, false);
	IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_189 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_35", null, 0, false);
	subContainer_77.addSubInstruction(sub_189);
		ISubRule sub_190 = new SubRule("req_uri", 0, 34, false, (IDCCoreVar)dcVars[45], false, "Notebooks &amp; Note_url_12", null, 0, false);
	subContainer_77.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_35", null, 0, false);
	subContainer_77.addSubInstruction(sub_191);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF761DEE2D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF76253C1D465E53465666464",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7644F90D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1898", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/notebooks-and-pads/N=5+530741/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;BVBRANDSID=eb82d432-00fd-48f9-acbf-4df4470a046c;BVBRANDID=61f5698b-aae7-4043-9078-2cb878a84c03;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522736.48;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;mt.pevt=mr%3Dt1655097818%26mi%3D'5.268323929.1656522714668'%26u%3D'https%3A%2F%2Fwww.officedepot.com%2Fa%2Fbrowse%2Fnotebooks-and-pads%2FN%253D5%252B530741%2F'%26e%3D!(xi)%26ii%3D!('5%2C1%2C3697948%2Cop_impression%2C%2C%2C%2C%2C1656522736%2C0%2C1656522737')%26eoq%3D!t;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu\"", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_15(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_192 = new SubRule("req_hdr_Referer_1", 0, 67, false, (IDCCoreVar)dcVars[44], false, "Referer_34", null, 0, false);
	subContainer_78.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_34", null, 0, false);
	subContainer_78.addSubInstruction(sub_193);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF761DEE2D465E53465666464"), 3);		
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
			"A1ECF7CFF7644F93D465E53465666464",
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
strBuf_15.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_15.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_15.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_15.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2737347,1920,1040,19");
strBuf_15.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_15.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.90684333");
strBuf_15.append("8453,828261368673.5,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows");
strBuf_15.append(";10.0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chro");
strBuf_15.append("me/102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en");
strBuf_15.append("-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1");
strBuf_15.append(",310,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0");
strBuf_15.append(",0,0,-1,310,0;-1,2,-94,-108,-1,2,-94,-110,0,3,627,699,514,-1");
strBuf_15.append(";1,1,669,699,514;2,4,835,699,514,-1;3,2,1002,699,514,-1;-1,2");
strBuf_15.append(",-94,-117,-1,2,-94,-111,0,1187,-1,-1,-1;-1,2,-94,-109,0,1187");
strBuf_15.append(",-1,-1,-1,-1,-1,-1,-1,-1,-1;-1,2,-94,-114,-1,2,-94,-103,-1,2");
strBuf_15.append(",-94,-112,https://www.officedepot.com/a/browse/notebooks-and");
strBuf_15.append("-pads/N=5+530741/-1,2,-94,-115,1,8033,32,1187,1187,0,10375,1");
strBuf_15.append("198,0,1656522737347,9,17721,0,4,2953,2,0,1199,5507,0,3B38199");
strBuf_15.append("BDE94057FD0DC91B16F184356~-1~YAAQjPo7F4E8MmSBAQAAQQpzsAhywuw");
strBuf_15.append("It9e5PgCn24RosvgZeG3uJsMT2VF8hMrVSrkVinuryY+BB7Trbvt8wMLoLIH");
strBuf_15.append("kcVRm6bkJAUIYSNrrZWr82kzOvOsvowQ7wzmJsC7nPQGOoiNDYvqvQsnxoIj");
strBuf_15.append("QFmbeX7mKYeaMD0yonXPQMSg1QJcxuvA9alGNzFAYbpQkKe/+dvRPRGXqWix");
strBuf_15.append("cyw/mbaSzcikj3xvJOGwEVAbmU8OHfUfJvykgZb2lmPUY5vRTe1FWjBH772a");
strBuf_15.append("eAk57JpiuF+7jf94hQCjrO6sxKKKnLJN3cW2V87y98I4HrWstD1M2SKcWIMQ");
strBuf_15.append("gm1vkHldFXFVlY0zUVv8Ya/XeNEP8Wue79nhWsgy9yCa3zXTm98YB0NOvymC");
strBuf_15.append("GqK6anZUXszUv~-1~-1~-1,38347,543,-930941724,30261693,PiZtE,8");
strBuf_15.append("9845,99,14,true-1,2,-94,-106,9,2-1,2,-94,-119,-1-1,2,-94,-12");
strBuf_15.append("2,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94,-124,-1,2,-94,-126,-1,");
strBuf_15.append("2,-94,-127,21321144241322243122-1,2,-94,-70,273720021;-85134");
strBuf_15.append("5892;dis;,7;true;true;true;-60;true;24;24;true;false;-1-1,2,");
strBuf_15.append("-94,-80,5372-1,2,-94,-116,41060037-1,2,-94,-118,110160-1,2,-");
strBuf_15.append("94,-129,,,0,,,,0-1,2,-94,-121,;2;9;0\"}");
String requestData_15 = strBuf_15.toString();
			
	HTTPPostDataChunk pdc_14 = new HTTPPostDataChunk("A1ECF7CFF7647690D465E53465666464", postData, requestData_15, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_14);

	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF764C4B0D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_194 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_33", null, 0, false);
	subContainer_79.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_uri", 0, 37, false, (IDCCoreVar)dcVars[47], false, "Notebooks &amp; Note_url_11", null, 0, false);
	subContainer_79.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_33", null, 0, false);
	subContainer_79.addSubInstruction(sub_196);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF764C4B3D465E53465666464",
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

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF76512DFD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_197 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_32", null, 0, false);
	subContainer_80.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_uri", 0, 28, false, (IDCCoreVar)dcVars[48], false, "Notebooks &amp; Note_url_10", null, 0, false);
	subContainer_80.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_32", null, 0, false);
	subContainer_80.addSubInstruction(sub_199);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);		
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
			"A1ECF7CFF76512E2D465E53465666464",
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

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF76560FED465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_200 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_31", null, 0, false);
	subContainer_81.addSubInstruction(sub_200);
		ISubRule sub_201 = new SubRule("req_uri", 0, 48, false, (IDCCoreVar)dcVars[50], false, "Notebooks &amp; Note_url_9", null, 0, false);
	subContainer_81.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_31", null, 0, false);
	subContainer_81.addSubInstruction(sub_202);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);		
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
			"A1ECF7CFF7656101D465E53465666464",
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

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF765884BD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_203 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_30", null, 0, false);
	subContainer_82.addSubInstruction(sub_203);
		ISubRule sub_204 = new SubRule("req_uri", 0, 62, false, (IDCCoreVar)dcVars[52], false, "Notebooks &amp; Note_url_8", null, 0, false);
	subContainer_82.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_30", null, 0, false);
	subContainer_82.addSubInstruction(sub_205);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF765884ED465E53465666464",
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

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF765AF77D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_206 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_29", null, 0, false);
	subContainer_83.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_uri", 0, 32, false, (IDCCoreVar)dcVars[53], false, "Notebooks &amp; Note_url_7", null, 0, false);
	subContainer_83.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_29", null, 0, false);
	subContainer_83.addSubInstruction(sub_208);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF765AF7AD465E53465666464",
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

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF765FD91D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_209 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_28", null, 0, false);
	subContainer_84.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_uri", 0, 32, false, (IDCCoreVar)dcVars[54], false, "Notebooks &amp; Note_url_6", null, 0, false);
	subContainer_84.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_28", null, 0, false);
	subContainer_84.addSubInstruction(sub_211);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);		
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
			"A1ECF7CFF765FD94D465E53465666464",
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

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7662493D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_212 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_27", null, 0, false);
	subContainer_85.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_uri", 0, 42, false, (IDCCoreVar)dcVars[55], false, "Notebooks &amp; Note_url_5", null, 0, false);
	subContainer_85.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_27", null, 0, false);
	subContainer_85.addSubInstruction(sub_214);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7662496D465E53465666464",
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

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7664BB7D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_215 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_26", null, 0, false);
	subContainer_86.addSubInstruction(sub_215);
		ISubRule sub_216 = new SubRule("req_uri", 0, 31, false, (IDCCoreVar)dcVars[56], false, "Notebooks &amp; Note_url_4", null, 0, false);
	subContainer_86.addSubInstruction(sub_216);
		ISubRule sub_217 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_26", null, 0, false);
	subContainer_86.addSubInstruction(sub_217);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7664BBAD465E53465666464",
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

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7669983D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_218 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_25", null, 0, false);
	subContainer_87.addSubInstruction(sub_218);
		ISubRule sub_219 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[57], false, "Notebooks &amp; Note_url_3", null, 0, false);
	subContainer_87.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_25", null, 0, false);
	subContainer_87.addSubInstruction(sub_220);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7669986D465E53465666464",
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

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF766C0D3D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_88 = new DataSub();
	reqAction.addDataSub(subContainer_88);

		ISubRule sub_221 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_24", null, 0, false);
	subContainer_88.addSubInstruction(sub_221);
		ISubRule sub_222 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_24", null, 0, false);
	subContainer_88.addSubInstruction(sub_222);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF766C0D6D465E53465666464",
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

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7670EF5D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_223 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_23", null, 0, false);
	subContainer_89.addSubInstruction(sub_223);
		ISubRule sub_224 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_23", null, 0, false);
	subContainer_89.addSubInstruction(sub_224);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF7670EF8D465E53465666464",
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

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7673643D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_225 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_22", null, 0, false);
	subContainer_90.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_22", null, 0, false);
	subContainer_90.addSubInstruction(sub_226);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7673646D465E53465666464",
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

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7675D09D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_227 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_21", null, 0, false);
	subContainer_91.addSubInstruction(sub_227);
		ISubRule sub_228 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_21", null, 0, false);
	subContainer_91.addSubInstruction(sub_228);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF7675D0CD465E53465666464",
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

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7678416D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_229 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_20", null, 0, false);
	subContainer_92.addSubInstruction(sub_229);
		ISubRule sub_230 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_20", null, 0, false);
	subContainer_92.addSubInstruction(sub_230);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF7678419D465E53465666464",
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

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF767AB31D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_93 = new DataSub();
	reqAction.addDataSub(subContainer_93);

		ISubRule sub_231 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_19", null, 0, false);
	subContainer_93.addSubInstruction(sub_231);
		ISubRule sub_232 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_19", null, 0, false);
	subContainer_93.addSubInstruction(sub_232);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF767AB34D465E53465666464",
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

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF767D23BD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_94 = new DataSub();
	reqAction.addDataSub(subContainer_94);

		ISubRule sub_233 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_18", null, 0, false);
	subContainer_94.addSubInstruction(sub_233);
		ISubRule sub_234 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_18", null, 0, false);
	subContainer_94.addSubInstruction(sub_234);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF767D23ED465E53465666464",
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

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF767F94BD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_95 = new DataSub();
	reqAction.addDataSub(subContainer_95);

		ISubRule sub_235 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_17", null, 0, false);
	subContainer_95.addSubInstruction(sub_235);
		ISubRule sub_236 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_95.addSubInstruction(sub_236);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF767F94ED465E53465666464",
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

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77BF630D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_96 = new DataSub();
	reqAction.addDataSub(subContainer_96);

		ISubRule sub_237 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_16", null, 0, false);
	subContainer_96.addSubInstruction(sub_237);
		ISubRule sub_238 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_16", null, 0, false);
	subContainer_96.addSubInstruction(sub_238);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF77BF633D465E53465666464",
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

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77C4450D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_97 = new DataSub();
	reqAction.addDataSub(subContainer_97);

		ISubRule sub_239 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_15", null, 0, false);
	subContainer_97.addSubInstruction(sub_239);
		ISubRule sub_240 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_97.addSubInstruction(sub_240);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF77C4453D465E53465666464",
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

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77C6BB0D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_98 = new DataSub();
	reqAction.addDataSub(subContainer_98);

		ISubRule sub_241 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_14", null, 0, false);
	subContainer_98.addSubInstruction(sub_241);
		ISubRule sub_242 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_14", null, 0, false);
	subContainer_98.addSubInstruction(sub_242);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF77C6BB3D465E53465666464",
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

	public HTTPAction request_99(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77C92CBD465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_99 = new DataSub();
	reqAction.addDataSub(subContainer_99);

		ISubRule sub_243 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_13", null, 0, false);
	subContainer_99.addSubInstruction(sub_243);
		ISubRule sub_244 = new SubRule("req_uri", 0, 43, false, (IDCCoreVar)dcVars[49], false, "Notebooks &amp; Note_url_2", null, 0, false);
	subContainer_99.addSubInstruction(sub_244);
		ISubRule sub_245 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_99.addSubInstruction(sub_245);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF77C92CED465E53465666464",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77D2EB3D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_100 = new DataSub();
	reqAction.addDataSub(subContainer_100);

		ISubRule sub_246 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_12", null, 0, false);
	subContainer_100.addSubInstruction(sub_246);
		ISubRule sub_247 = new SubRule("req_uri", 0, 57, false, (IDCCoreVar)dcVars[51], false, "Notebooks &amp; Note_url", null, 0, false);
	subContainer_100.addSubInstruction(sub_247);
		ISubRule sub_248 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_100.addSubInstruction(sub_248);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF77D2EB6D465E53465666464",
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

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77DA3E3D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_ga=GA1.2.557129673.1656522721;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522739.45;RT=\"z=1&dm=officedepot.com&si=630jwr14r6&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1&nu=b6d05f97e8b312b78a737ac14a35261f&cl=g9m&ld=gdr&r=11b14bcb60d4c08486d0076f8c554b5f&ul=gdu&hd=hid\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_101 = new DataSub();
	reqAction.addDataSub(subContainer_101);

		ISubRule sub_249 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_11", null, 0, false);
	subContainer_101.addSubInstruction(sub_249);
		ISubRule sub_250 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_101.addSubInstruction(sub_250);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF70F03F8D465E53465666464"), 3);		
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
			"A1ECF7CFF77DA3E6D465E53465666464",
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

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77DF200D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "537", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_16(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_102 = new DataSub();
	reqAction.addDataSub(subContainer_102);

		ISubRule sub_251 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_10", null, 0, false);
	subContainer_102.addSubInstruction(sub_251);
		ISubRule sub_252 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_10", null, 0, false);
	subContainer_102.addSubInstruction(sub_252);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);		
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
			"A1ECF7CFF77DF203D465E53465666464",
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
	private void postDataClass_16(HTTPPostData postData) {
				StringBuffer strBuf_16 = new StringBuffer();
strBuf_16.append("id=c5c81c89-b48f-4f24-b3a3-8304bf4ded98&tagId=11024&fullRefe");
strBuf_16.append("rrerUrl=https%3A%2F%2Fwww.officedepot.com%2Fa%2Fbrowse%2Fwri");
strBuf_16.append("ting-pads%2FN%3D5%2B549829%2F&payload=%7B%22sitePage%22%3A%7");
strBuf_16.append("B%22enterpriseId%22%3A%221523082%22%2C%22cartSubtotal%22%3A%");
strBuf_16.append("220%22%2C%22trackingSource%22%3A%22gtm%22%2C%22pageType%22%3");
strBuf_16.append("A%22N%2FA%22%2C%22%22%3A%7B%22userId%22%3A%22%22%2C%22emailH");
strBuf_16.append("ash%22%3A%22%22%2C%22marketing_channel%22%3A%22In%20Progress");
strBuf_16.append("%22%7D%7D%7D&isDeviceAccessGranted=false&cjUser=00000000-000");
strBuf_16.append("0-0000-0000-000000000000&cookies=cjConsent%3DMHxZfDB8Tnww");
String requestData_16 = strBuf_16.toString();
			
	HTTPPostDataChunk pdc_15 = new HTTPPostDataChunk("A1ECF7CFF77DF25CD465E53465666464", postData, requestData_16, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_15);

	}

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77E1963D465E53465666464", getHTTPTest());
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_103 = new DataSub();
	reqAction.addDataSub(subContainer_103);

		ISubRule sub_253 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_9", null, 0, false);
	subContainer_103.addSubInstruction(sub_253);
		ISubRule sub_254 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_103.addSubInstruction(sub_254);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF77E1966D465E53465666464",
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

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77E8E4ED465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.v=5.268323929.1656522714668;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_104 = new DataSub();
	reqAction.addDataSub(subContainer_104);

		ISubRule sub_255 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_8", null, 0, false);
	subContainer_104.addSubInstruction(sub_255);
		ISubRule sub_256 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_8", null, 0, false);
	subContainer_104.addSubInstruction(sub_256);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF77E8E51D465E53465666464",
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

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77EB5A9D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.v=5.268323929.1656522714668;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_105 = new DataSub();
	reqAction.addDataSub(subContainer_105);

		ISubRule sub_257 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_7", null, 0, false);
	subContainer_105.addSubInstruction(sub_257);
		ISubRule sub_258 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_7", null, 0, false);
	subContainer_105.addSubInstruction(sub_258);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF77EB5ACD465E53465666464",
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

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77F51A1D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.v=5.268323929.1656522714668;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_106 = new DataSub();
	reqAction.addDataSub(subContainer_106);

		ISubRule sub_259 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_6", null, 0, false);
	subContainer_106.addSubInstruction(sub_259);
		ISubRule sub_260 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_6", null, 0, false);
	subContainer_106.addSubInstruction(sub_260);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF77F51A4D465E53465666464",
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

	public HTTPAction request_107(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF77FEDE1D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.v=5.268323929.1656522714668;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_107 = new DataSub();
	reqAction.addDataSub(subContainer_107);

		ISubRule sub_261 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_5", null, 0, false);
	subContainer_107.addSubInstruction(sub_261);
		ISubRule sub_262 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_5", null, 0, false);
	subContainer_107.addSubInstruction(sub_262);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF77FEDE4D465E53465666464",
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

	public HTTPAction request_108(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7801531D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.v=5.268323929.1656522714668;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_108 = new DataSub();
	reqAction.addDataSub(subContainer_108);

		ISubRule sub_263 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_4", null, 0, false);
	subContainer_108.addSubInstruction(sub_263);
		ISubRule sub_264 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_4", null, 0, false);
	subContainer_108.addSubInstruction(sub_264);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF7801534D465E53465666464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_109(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF781265ED465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ma.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.63 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mt.v=5.268323929.1656522714668;cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;mt.mbsh=%7B%221656522736124%22%3A%7B%7D%7D;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_109 = new DataSub();
	reqAction.addDataSub(subContainer_109);

		ISubRule sub_265 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[3], false, "Referer_3", null, 0, false);
	subContainer_109.addSubInstruction(sub_265);
		ISubRule sub_266 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[1], false, "Host_3", null, 0, false);
	subContainer_109.addSubInstruction(sub_266);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF7812661D465E53465666464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_110(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7825ED4D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3458", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;_ga=GA1.1.557129673.1656522721;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\";mt.mbsh=%7B%221656522743322%22%3A%7B%7D%7D", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_17(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_110 = new DataSub();
	reqAction.addDataSub(subContainer_110);

		ISubRule sub_267 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer_2", null, 0, false);
	subContainer_110.addSubInstruction(sub_267);
		ISubRule sub_268 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_110.addSubInstruction(sub_268);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7644F90D465E53465666464"), 3);		
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
			"A1ECF7CFF7825ED7D465E53465666464",
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
	private void postDataClass_17(HTTPPostData postData) {
				StringBuffer strBuf_17 = new StringBuffer();
strBuf_17.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_17.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_17.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_17.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2743506,1920,1040,19");
strBuf_17.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_17.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.93095711");
strBuf_17.append("4465,828261371753,0,loc:-1,2,-94,-131,-1,2,-94,-101,do_en,dm");
strBuf_17.append("_en,t_en-1,2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,");
strBuf_17.append("0,0,0,-1,310,0;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2");
strBuf_17.append(",0,0,1240,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2");
strBuf_17.append(",0,0,1243,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2");
strBuf_17.append(",0,0,1246,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2");
strBuf_17.append(",0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2");
strBuf_17.append(",0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2");
strBuf_17.append(",0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2");
strBuf_17.append(",0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2");
strBuf_17.append(",0,0,1292,2058,0;0,2,0,0,1293,2059,0;-1,-1,1,0,-1,205,0;-1,-");
strBuf_17.append("1,1,0,-1,219,0;-1,-1,1,0,-1,208,0;-1,-1,1,0,-1,222,0;-1,-1,1");
strBuf_17.append(",0,-1,207,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1270,0;-1,-1,1,0");
strBuf_17.append(",-1,774,0;-1,-1,1,0,-1,1283,0;-1,-1,1,0,-1,1350,0;-1,-1,1,0,");
strBuf_17.append("-1,886,0;-1,-1,1,0,-1,234,0;-1,-1,1,0,-1,219,0;-1,-1,1,0,-1,");
strBuf_17.append("118,0;-1,-1,1,0,-1,114,0;-1,-1,1,0,-1,200,0;-1,-1,1,0,-1,111");
strBuf_17.append(",0;-1,-1,1,0,-1,312,0;-1,-1,1,0,-1,221,0;-1,-1,1,0,-1,321,0;");
strBuf_17.append("-1,-1,1,0,-1,216,0;-1,-1,1,0,-1,225,0;-1,-1,1,0,-1,333,0;-1,");
strBuf_17.append("-1,1,0,-1,336,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101");
strBuf_17.append(",-1,0;0,0,0,0,-1,310,0;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,10");
strBuf_17.append("60,0;0,2,0,0,1240,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,20");
strBuf_17.append("08,0;0,2,0,0,1243,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,20");
strBuf_17.append("11,0;0,2,0,0,1246,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,20");
strBuf_17.append("14,0;0,2,0,0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,20");
strBuf_17.append("57,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,20");
strBuf_17.append("60,0;0,2,0,0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,20");
strBuf_17.append("63,0;0,2,0,0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,20");
strBuf_17.append("57,0;0,2,0,0,1292,2058,0;0,2,0,0,1293,2059,0;-1,-1,1,0,-1,20");
strBuf_17.append("5,0;-1,-1,1,0,-1,219,0;-1,-1,1,0,-1,208,0;-1,-1,1,0,-1,222,0");
strBuf_17.append(";-1,-1,1,0,-1,207,0;-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1270,0;-");
strBuf_17.append("1,-1,1,0,-1,774,0;-1,-1,1,0,-1,1283,0;-1,-1,1,0,-1,1350,0;-1");
strBuf_17.append(",-1,1,0,-1,886,0;-1,-1,1,0,-1,234,0;-1,-1,1,0,-1,219,0;-1,-1");
strBuf_17.append(",1,0,-1,118,0;-1,-1,1,0,-1,114,0;-1,-1,1,0,-1,200,0;-1,-1,1,");
strBuf_17.append("0,-1,111,0;-1,-1,1,0,-1,312,0;-1,-1,1,0,-1,221,0;-1,-1,1,0,-");
strBuf_17.append("1,321,0;-1,-1,1,0,-1,216,0;-1,-1,1,0,-1,225,0;-1,-1,1,0,-1,3");
strBuf_17.append("33,0;-1,-1,1,0,-1,336,0;-1,2,-94,-108,-1,2,-94,-110,-1,2,-94");
strBuf_17.append(",-117,-1,2,-94,-111,-1,2,-94,-109,-1,2,-94,-114,-1,2,-94,-10");
strBuf_17.append("3,-1,2,-94,-112,https://www.officedepot.com/a/browse/writing");
strBuf_17.append("-pads/N=5+549829/-1,2,-94,-115,1,32,32,0,0,0,0,4,0,165652274");
strBuf_17.append("3506,-999999,17721,0,0,2953,0,0,7,0,0,3B38199BDE94057FD0DC91");
strBuf_17.append("B16F184356~-1~YAAQjPo7F5g8MmSBAQAAzg5zsAgrSDw8RjlJ30LWc3fAIO");
strBuf_17.append("qrW8K1dJBpl8MKjlzEf9IoztuY7a+BCa8Q0UF+YJfNjqHT3siM3O6pqKeRgs");
strBuf_17.append("zkIWh4uwpiB4zYIchXThzhvx/hlt90IyuCDws04UrKbIAhtRcAWeYr3/Allm");
strBuf_17.append("cL8xAWUEEjChrHqLiJ1e1fYrroh0UaKAqYVsm0xU4799nyAGjo+qDdPZV7Qh");
strBuf_17.append("lUWscO7aNFZJrG+tfVV53r0h0c/8X2f3HCZhLiAJ0Jnrd2qVAewIoVamJWJC");
strBuf_17.append("UmE1IylNJfiisEetnHSbKpaUZNUN6JHDxNfZCMA8RZ2PsRJUvfAn96n/Ehhm");
strBuf_17.append("M9h8mhSPb0nNgonajgzcQaKAdY+JTmVob3jaXStNwo8XoiDoaDyZFMhF6a~-");
strBuf_17.append("1~-1~-1,37684,-1,-1,30261693,PiZtE,100894,48,14,true-1,2,-94");
strBuf_17.append(",-106,0,0-1,2,-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94");
strBuf_17.append(",-123,-1,2,-94,-124,-1,2,-94,-126,-1,2,-94,-127,8-1,2,-94,-7");
strBuf_17.append("0,-1-1,2,-94,-80,94-1,2,-94,-116,41152515-1,2,-94,-118,18508");
strBuf_17.append("2-1,2,-94,-129,-1,2,-94,-121,;7;-1;0\"}");
String requestData_17 = strBuf_17.toString();
			
	HTTPPostDataChunk pdc_16 = new HTTPPostDataChunk("A1ECF7CFF78285E0D465E53465666464", postData, requestData_17, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_16);

	}

	public HTTPAction request_111(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1ECF7CFF7828640D465E53465666464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.officedepot.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3302", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://www.officedepot.com/a/browse/writing-pads/N=5+549829/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "cspAdPlacement=true;returnsResponsive=true;subscriptionAIService=true;newMyFilesExperienceIsActive=true;_gcl_au=1.1.294711541.1656522720;_gid=GA1.2.688085649.1656522721;_dc_gtm_UA-102713874-13=1;xdVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;atgRecVisitorId=1377pMPA-NgoLXIkBi5CQEVYwOTHv1i7yI-Bv1SsMoavDwQ0D50;NoCookie=true;_mibhv=anon-1656522724866-8194998148_5124;_rdt_uuid=1656522724938.a03e70d2-4397-4c24-8d9d-45c42caffd9e;_cls_v=516b776c-8a50-4e24-b12a-8508fec01eb4;_cls_s=30c50a30-4ed0-49a0-be8f-c2c8055df71f:0;atgRecSessionId=AQSwctatnLaIyzFcQhbaSSQoM54pjSBwm3JS1xR--7jTrnjnCHjE!-1988786320!-309206906;_scid=2edf1713-78e6-45dc-9544-365722deda0b;cjConsent=MHxZfDB8Tnww;_fbp=fb.1.1656522728620.1487318021;mt.sac_1=t;_pin_unauth=dWlkPVlqQTJNbUk1T1RrdE56SXlaaTAwWkRFd0xUbGlORGN0TkRreFpUQTBPVGN5WTJZeg;_clck=1fyo0fu|1|f2q|0;BVBRANDSID=57eba24a-4171-4646-857c-3dc8a76b4da7;BVBRANDID=f41ddc2b-4931-4db6-838a-5e79b5c496fe;FINID=5b641b2f0d2db4279c1878be9114d90e;_clsk=124pufl|1656522739872|1|0|l.clarity.ms/collect;_ga_MZ424N4G1Y=GS1.1.1656522724.1.1.1656522741.43;RT=\"z=1&dm=officedepot.com&si=mbumnex409&ss=l4zuuszx&sl=3&tt=8jp&obo=1&rl=1\";mt.mbsh=%7B%221656522743322%22%3A%7B%7D%7D;_ga=GA1.2.557129673.1656522721;_uetsid=998c5620f7ce11ec9fa3f359133336f1;_uetvid=998cd580f7ce11eca73057a97f6af043", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_18(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_111 = new DataSub();
	reqAction.addDataSub(subContainer_111);

		ISubRule sub_269 = new SubRule("req_hdr_Referer_1", 0, 61, false, (IDCCoreVar)dcVars[46], false, "Referer", null, 0, false);
	subContainer_111.addSubInstruction(sub_269);
		ISubRule sub_270 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_111.addSubInstruction(sub_270);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF76253BED465E53465666464"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1ECF7CFF7825ED4D465E53465666464"), 3);		
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
			"A1ECF7CFF7828643D465E53465666464",
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
	private void postDataClass_18(HTTPPostData postData) {
				StringBuffer strBuf_18 = new StringBuffer();
strBuf_18.append("{\"sensor_data\":\"7a74G7m23Vrp0o5c9353501.75-1,2,-94,-100,Mozi");
strBuf_18.append("lla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KH");
strBuf_18.append("TML, like Gecko) Chrome/102.0.5005.63 Safari/537.36,uaend,12");
strBuf_18.append("147,20030107,en-GB,Gecko,5,0,0,0,407583,2743506,1920,1040,19");
strBuf_18.append("20,1080,1238,889,1254,,cpen:0,i1:0,dm:0,cwen:0,non:1,opc:0,f");
strBuf_18.append("c:0,sc:0,wrc:1,isc:0,vib:1,bat:1,x11:0,x12:1,8311,0.02471905");
strBuf_18.append("112,828261371753,0,loc:-1,2,-94,-131,Mozilla/5.0 (Windows;10");
strBuf_18.append(".0.0;x86;64;) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/");
strBuf_18.append("102.0.5005.63 Safari/537.36-1,2,-94,-101,do_en,dm_en,t_en-1,");
strBuf_18.append("2,-94,-105,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0,0,-1,31");
strBuf_18.append("0,0;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,0,1240,2");
strBuf_18.append("006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,0,1243,2");
strBuf_18.append("009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,0,1246,2");
strBuf_18.append("012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,0,1289,2");
strBuf_18.append("055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1292,2");
strBuf_18.append("058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,0,1295,2");
strBuf_18.append("061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,0,1298,2");
strBuf_18.append("064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,0,1292,2");
strBuf_18.append("058,0;0,2,0,0,1293,2059,0;-1,-1,1,0,-1,205,0;-1,-1,1,0,-1,21");
strBuf_18.append("9,0;-1,-1,1,0,-1,208,0;-1,-1,1,0,-1,222,0;-1,-1,1,0,-1,207,0");
strBuf_18.append(";-1,-1,1,0,-1,231,0;-1,-1,1,0,-1,1270,0;-1,-1,1,0,-1,774,0;-");
strBuf_18.append("1,-1,1,0,-1,1283,0;-1,-1,1,0,-1,1350,0;-1,-1,1,0,-1,886,0;-1");
strBuf_18.append(",-1,1,0,-1,234,0;-1,-1,1,0,-1,219,0;-1,-1,1,0,-1,118,0;-1,-1");
strBuf_18.append(",1,0,-1,114,0;-1,-1,1,0,-1,200,0;-1,-1,1,0,-1,111,0;-1,-1,1,");
strBuf_18.append("0,-1,312,0;-1,-1,1,0,-1,221,0;-1,-1,1,0,-1,321,0;-1,-1,1,0,-");
strBuf_18.append("1,216,0;-1,-1,1,0,-1,225,0;-1,-1,1,0,-1,333,0;-1,-1,1,0,-1,3");
strBuf_18.append("36,0;-1,2,-94,-102,0,0,0,0,-1,310,0;0,-1,0,0,5101,-1,0;0,0,0");
strBuf_18.append(",0,-1,310,0;0,-1,0,0,1057,1057,0;0,-1,0,0,1060,1060,0;0,2,0,");
strBuf_18.append("0,1240,2006,0;0,2,0,0,1241,2007,0;0,2,0,0,1242,2008,0;0,2,0,");
strBuf_18.append("0,1243,2009,0;0,2,0,0,1244,2010,0;0,2,0,0,1245,2011,0;0,2,0,");
strBuf_18.append("0,1246,2012,0;0,2,0,0,1247,2013,0;0,2,0,0,1248,2014,0;0,2,0,");
strBuf_18.append("0,1289,2055,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,");
strBuf_18.append("0,1292,2058,0;0,2,0,0,1293,2059,0;0,2,0,0,1294,2060,0;0,2,0,");
strBuf_18.append("0,1295,2061,0;0,2,0,0,1296,2062,0;0,2,0,0,1297,2063,0;0,2,0,");
strBuf_18.append("0,1298,2064,0;0,2,0,0,1290,2056,0;0,2,0,0,1291,2057,0;0,2,0,");
strBuf_18.append("0,1292,2058,0;0,2,0,0,1293,2059,0;-1,2,-94,-108,-1,2,-94,-11");
strBuf_18.append("0,0,1,16,1124,117;1,1,274,-1,-1;-1,2,-94,-117,-1,2,-94,-111,");
strBuf_18.append("0,599,-1,-1,-1;-1,2,-94,-109,0,598,-1,-1,-1,-1,-1,-1,-1,-1,-");
strBuf_18.append("1;-1,2,-94,-114,-1,2,-94,-103,-1,2,-94,-112,https://www.offi");
strBuf_18.append("cedepot.com/a/browse/writing-pads/N=5+549829/-1,2,-94,-115,1");
strBuf_18.append(",1564,32,599,598,0,2729,617,0,1656522743506,16,17721,0,2,295");
strBuf_18.append("3,0,0,620,1487,0,3B38199BDE94057FD0DC91B16F184356~-1~YAAQjPo");
strBuf_18.append("7Fw09MmSBAQAAsx9zsAiPJ/pPFv5bJ2Lv/TUmXeCoOT7/+dNOotVTUxU4+Pr");
strBuf_18.append("Vw4DtglA/J4MbCxi1Tky2fK0wfIJzz8i1pJm2XKA/zDYuWQ8eY5Fk5SPiwAD");
strBuf_18.append("MvdfkYIdEP09gH84CVE+SS/aRLEMkqsBN23Gvo8DgEs9nX1BpaLWh+wsmRRZ");
strBuf_18.append("xBrtpTwI/uOi56GU+LECy9VNsuxVsZvyjMjanFMiGrwHVVfTDL0jgFnN/A9J");
strBuf_18.append("SSwMjbyKy+LIDChjn8IJedAG6YqE4+1BDybhx7fm1lbE9+Gyt/he5b6b2OUo");
strBuf_18.append("GwRn4rPcImpLSvaxfD87annPvY9GT8s8/+lnO4E2jfe+QJP3ZqDxfo8axo7k");
strBuf_18.append("7fQYnVCrUSdSVx8LPhT+z6CTyY8WHEgzAwXvL~-1~-1~-1,37061,965,864");
strBuf_18.append("633966,30261693,PiZtE,31377,72,14,true-1,2,-94,-106,9,1-1,2,");
strBuf_18.append("-94,-119,-1-1,2,-94,-122,0,0,1,0,1,0,0-1,2,-94,-123,-1,2,-94");
strBuf_18.append(",-124,-1,2,-94,-126,-1,2,-94,-127,21321144241322243122-1,2,-");
strBuf_18.append("94,-70,273720021;-851345892;dis;,7;true;true;true;-60;true;2");
strBuf_18.append("4;24;true;false;-1-1,2,-94,-80,5372-1,2,-94,-116,41152515-1,");
strBuf_18.append("2,-94,-118,176161-1,2,-94,-129,,,0,,,,0-1,2,-94,-121,;5;14;0");
strBuf_18.append("\"}");
String requestData_18 = strBuf_18.toString();
			
	HTTPPostDataChunk pdc_17 = new HTTPPostDataChunk("A1ECF7CFF782AD46D465E53465666464", postData, requestData_18, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_17);

	}
}
