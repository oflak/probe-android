package org.openobservatory.ooniprobe.test2;

import org.openobservatory.ooniprobe.activity.AbstractActivity;
import org.openobservatory.ooniprobe.model.JsonResult;

public class NdtTest extends AbstractTest.TestJsonResult {
	public NdtTest(AbstractActivity activity) {
		super(activity, new org.openobservatory.measurement_kit.nettests.NdtTest());
	}

	@Override public void onEntry(JsonResult result) {
		super.onEntry(result);
		// TODO add onEntry specific logic here
	}
}
