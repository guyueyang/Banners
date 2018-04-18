package rxtools.guyueyang.com.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import rxtools.guyueyang.com.banner.transformer.AccordionTransformer;
import rxtools.guyueyang.com.banner.transformer.BackgroundToForegroundTransformer;
import rxtools.guyueyang.com.banner.transformer.CubeInTransformer;
import rxtools.guyueyang.com.banner.transformer.CubeOutTransformer;
import rxtools.guyueyang.com.banner.transformer.DefaultTransformer;
import rxtools.guyueyang.com.banner.transformer.DepthPageTransformer;
import rxtools.guyueyang.com.banner.transformer.FlipHorizontalTransformer;
import rxtools.guyueyang.com.banner.transformer.FlipVerticalTransformer;
import rxtools.guyueyang.com.banner.transformer.ForegroundToBackgroundTransformer;
import rxtools.guyueyang.com.banner.transformer.RotateDownTransformer;
import rxtools.guyueyang.com.banner.transformer.RotateUpTransformer;
import rxtools.guyueyang.com.banner.transformer.ScaleInOutTransformer;
import rxtools.guyueyang.com.banner.transformer.StackTransformer;
import rxtools.guyueyang.com.banner.transformer.TabletTransformer;
import rxtools.guyueyang.com.banner.transformer.ZoomInTransformer;
import rxtools.guyueyang.com.banner.transformer.ZoomOutSlideTransformer;
import rxtools.guyueyang.com.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
