/*
 * generated by Xtext
 */
package org.muml.pm.software.platform.oslanguage.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractOperatingSystemLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pm/software/platform/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/behavior/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/valuetype/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/core/expressions/common/1.0.0"));
		return result;
	}
}