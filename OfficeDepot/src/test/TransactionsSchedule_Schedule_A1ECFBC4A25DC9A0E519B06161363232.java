/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.ArmableTransaction;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.RandomTask;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.action.impl.WeightedBlock;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class TransactionsSchedule_Schedule_A1ECFBC4A25DC9A0E519B06161363232
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public TransactionsSchedule_Schedule_A1ECFBC4A25DC9A0E519B06161363232(IContainer parent, String name) {
		super(parent, name, "A1ECFBC4A25DC9A0E519B06161363232");
		super.actualScheduleName = "Transactions Schedule";
		setThinkScheme(IKThinkControl.FIXED);
		setThinkFixed(2000);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new HTTPPageTitleVPEvent(), null, 1, "Page title verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseCodeVPEvent(), null, 1, "Response code verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseSizeVPEvent(), null, 1, "Response size verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTContinueEvent("End of dataset reached"), 2, "End of dataset reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTContinueEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		HashMap http_hm = new HashMap();
		http_hm.put("Chk-Collect-Individual-Page-Element-data", "true"); // add line speed enabled flag 
		this.addInitially(new FeatureOptionsDataAreaCreation(this, "com.ibm.rational.test.lt.feature.http", http_hm));
		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "User Group 1", "A1EA98F365EB365CFF9FE13165613463");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EA98F365EB3667FF9FE13165613463") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					For loopNm_1 = Loop_1(this);
					this.add(loopNm_1);
					loopNm_1.addVarsToInit(null);

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1EA98F3AE08AB20FF9FE13165613463", 15, 60000, 0, 0, 1, true, false,
				null) {

			public void executeLoop() {

				this.add(randomLoop_1(this));
				super.executeLoop();
			}

		};
		return forLoop;
	}

	private RandomTask randomLoop_1(IContainer parent) {
		RandomTask randomTask = new RandomTask(parent, "Random Selector", "A1EA98F3929F4DD0FF9FE13165613463", 1) {
			public void execute() {
				this.add(weightedBlock_1(this));
				this.add(weightedBlock_2(this));
				super.execute();
			}
		};
		return randomTask;
	}

	private WeightedBlock weightedBlock_1(IContainer parent) {
		WeightedBlock wtBlock = new WeightedBlock(parent, "Guest Checkout", "A1EA98F3A6F80B53FF9FE13165613463", 3) {

			public void execute() {
				this.add(transaction_1(this));
				super.execute();
			}
		};

		return wtBlock;
	}

	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "GuestCheckout", "A1EB9164AFEB4280C725B66562396264") {

			public void execute() {

				this.add(new test.Homepage_Test_A1ECFBC43DE2AD1EE519B06161363232(this,
						"A1ECFBC4D7089B30E519B06161363232") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.SearchAndProductDetails_Test_A1ECFBC447B5A289E519B06161363232(this,
						"A1ECFBC4DAFB0B10E519B06161363232") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.AddToCart_Test_A1ECFBC45ED19CC3E519B06161363232(this,
						"A1ECFBC4DDF956F0E519B06161363232") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				super.execute();
			}

			public void finish(IKAction child) {
				super.finish(child);
				if (hasFinished()) {

				}
			}
		};
		trx.setArmEnabled(false);
		trx.setIgnoreUnhealthy(false);
		return trx;
	}

	private WeightedBlock weightedBlock_2(IContainer parent) {
		WeightedBlock wtBlock = new WeightedBlock(parent, "Guest Browse", "A1EA98F3A6F80B8CFF9FE13165613463", 27) {

			public void execute() {
				this.add(transaction_2(this));
				super.execute();
			}
		};

		return wtBlock;
	}

	private ArmableTransaction transaction_2(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "GuestBrowse", "A1EB9164D7AFEC80C725B66562396264") {

			public void execute() {

				this.add(new test.Homepage_Test_A1ECFBC43DE2AD1EE519B06161363232(this,
						"A1ECFBC4BAE515A0E519B06161363232") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new test.SearchAndProductDetails_Test_A1ECFBC447B5A289E519B06161363232(this,
						"A1ECFBC4C04398A0E519B06161363232") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				super.execute();
			}

			public void finish(IKAction child) {
				super.finish(child);
				if (hasFinished()) {

				}
			}
		};
		trx.setArmEnabled(false);
		trx.setIgnoreUnhealthy(false);
		return trx;
	}

}