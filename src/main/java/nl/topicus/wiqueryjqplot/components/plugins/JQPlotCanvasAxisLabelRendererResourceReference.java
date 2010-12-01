package nl.topicus.wiqueryjqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

public class JQPlotCanvasAxisLabelRendererResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotCanvasAxisLabelRendererResourceReference INSTANCE =
		new JQPlotCanvasAxisLabelRendererResourceReference();

	private JQPlotCanvasAxisLabelRendererResourceReference()
	{
		super(JQPlotCanvasAxisLabelRendererResourceReference.class,
			"jqplot.canvasAxisLabelRenderer.js");
	}

	public static JQPlotCanvasAxisLabelRendererResourceReference get()
	{
		return INSTANCE;
	}
}
