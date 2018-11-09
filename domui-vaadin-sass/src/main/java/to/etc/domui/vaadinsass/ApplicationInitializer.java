package to.etc.domui.vaadinsass;

import to.etc.domui.sass.SassCompilerFactory;
import to.etc.domui.server.DomApplication;
import to.etc.domui.server.IApplicationInitializer;

/**
 * @author <a href="mailto:jal@etc.to">Frits Jalvingh</a>
 * Created on 9-11-18.
 */
public class ApplicationInitializer implements IApplicationInitializer {
	public void onStartInitialization(DomApplication da) {
		SassCompilerFactory.register(new VaadinSassCompiler());
	}

	public void onEndInitialization(DomApplication da) {
		System.out.println("domui: Vaadin Sass compiler registered");
	}

	public void onAfterDestroy(DomApplication da) {
	}
}
