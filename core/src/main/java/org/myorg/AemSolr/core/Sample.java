package org.myorg.AemSolr.core;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.widgets.TextArea;

@Component(value = "samp")
public class Sample {
	@DialogField(fieldLabel="Text")
	@TextArea
	private String text;
}

