package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LabelSelector extends Bean {

	@YamlPropertyName(value="matchLabels")
	Map<String,String> getMatchLabels() throws Exception;

	@YamlPropertyName(value="matchExpressions")
	List<LabelSelectorRequirement> getMatchExpressions() throws Exception;

	interface EZ extends LabelSelector {

		default Map<String,String> getMatchLabels() throws Exception { return null; }

		default List<LabelSelectorRequirement> getMatchExpressions() throws Exception { return null; }

	}

}
