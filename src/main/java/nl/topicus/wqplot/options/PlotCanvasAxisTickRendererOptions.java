package nl.topicus.wqplot.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotCanvasAxisTickRendererOptions extends PlotTickOptions
{
	private static final long serialVersionUID = 1L;

	/** if this is a minor tick. */
	private Boolean isMinorTick;

	/** angle of text, measured clockwise from x axis. */
	private Double angle;

	/**
	 * ’auto’, ‘start’, ‘middle’ or ‘end’. Whether tick label should be positioned so the
	 * start, middle, or end of the tick mark.
	 */
	private PlotTickLabelPosition labelPosition;

	/**
	 * A class of a formatter for the tick text. The default $.jqplot.DefaultTickFormatter
	 * uses sprintf.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class)
	private String formatter;

	/** string appended to the tick label if no formatString is specified. */
	private String prefix;

	/** css spec for the font-family css attribute. */
	private String fontFamily;

	/** CSS spec for font size. */
	private String fontSize;

	/** CSS spec for fontWeight */
	private String fontWeight;

	/**
	 * Multiplier to condense or expand font width. Applies only to browsers which don’t
	 * support canvas native font rendering.
	 */
	private Double fontStretch;

	/** css spec for the color attribute. */
	private String textColor;

	/**
	 * true to turn on native canvas font support in Mozilla 3.5+ and Safari 4+. If true,
	 * tick label will be drawn with canvas tag native support for fonts. If false, tick
	 * label will be drawn with Hershey font metrics.
	 */
	private Boolean enableFontSupport;

	/**
	 * Point to pixel scaling factor, used for computing height of bounding box around a
	 * label. The labels text renderer has a default setting of 1.4, which should be
	 * suitable for most fonts. Leave as null to use default. If tops of letters appear
	 * clipped, increase this. If bounding box seems too big, decrease. This is an issue
	 * only with the native font renderering capabilities of Mozilla 3.5 and Safari 4
	 * since they do not provide a method to determine the font height.
	 */
	private Double pt2px;

	public PlotCanvasAxisTickRendererOptions()
	{
	}

	public Boolean getIsMinorTick()
	{
		return isMinorTick;
	}

	public PlotCanvasAxisTickRendererOptions setIsMinorTick(Boolean isMinorTick)
	{
		this.isMinorTick = isMinorTick;
		return this;
	}

	public Double getAngle()
	{
		return angle;
	}

	public PlotCanvasAxisTickRendererOptions setAngle(Double angle)
	{
		this.angle = angle;
		return this;
	}

	public PlotTickLabelPosition getLabelPosition()
	{
		return labelPosition;
	}

	public PlotCanvasAxisTickRendererOptions setLabelPosition(PlotTickLabelPosition labelPosition)
	{
		this.labelPosition = labelPosition;
		return this;
	}

	public String getFormatter()
	{
		return formatter;
	}

	public PlotCanvasAxisTickRendererOptions setFormatter(String formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public String getPrefix()
	{
		return prefix;
	}

	public PlotCanvasAxisTickRendererOptions setPrefix(String prefix)
	{
		this.prefix = prefix;
		return this;
	}

	public String getFontFamily()
	{
		return fontFamily;
	}

	public PlotCanvasAxisTickRendererOptions setFontFamily(String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotCanvasAxisTickRendererOptions setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}

	public String getFontWeight()
	{
		return fontWeight;
	}

	public PlotCanvasAxisTickRendererOptions setFontWeight(String fontWeight)
	{
		this.fontWeight = fontWeight;
		return this;
	}

	public Double getFontStretch()
	{
		return fontStretch;
	}

	public PlotCanvasAxisTickRendererOptions setFontStretch(Double fontStretch)
	{
		this.fontStretch = fontStretch;
		return this;
	}

	public String getTextColor()
	{
		return textColor;
	}

	public PlotCanvasAxisTickRendererOptions setTextColor(String textColor)
	{
		this.textColor = textColor;
		return this;
	}

	public Boolean getEnableFontSupport()
	{
		return enableFontSupport;
	}

	public PlotCanvasAxisTickRendererOptions setEnableFontSupport(Boolean enableFontSupport)
	{
		this.enableFontSupport = enableFontSupport;
		return this;
	}

	public Double getPt2px()
	{
		return pt2px;
	}

	public PlotCanvasAxisTickRendererOptions setPt2px(Double pt2px)
	{
		this.pt2px = pt2px;
		return this;
	}
}