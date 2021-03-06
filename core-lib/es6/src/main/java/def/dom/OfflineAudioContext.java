package def.dom;

import def.js.StringTypes;
import def.js.StringTypes.complete;

public class OfflineAudioContext extends AudioContext {
    public java.util.function.Function<Event,java.lang.Object> oncomplete;
    native public void startRendering();
    native public void addEventListener(def.js.StringTypes.complete type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static OfflineAudioContext prototype;
    public OfflineAudioContext(double numberOfChannels, double length, double sampleRate){}
    native public void addEventListener(def.js.StringTypes.complete type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
    protected OfflineAudioContext(){}
}

