// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.tuned.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Tuned extends Bean {

	default String getKind() { return "Tuned"; }
	default String getApiVersion() { return "v1alpha1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return ""; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="spec")
	TunedSpec getSpec() throws Exception;

	interface EZ extends Tuned {

		@YamlPropertyName(value="spec")
		default TunedSpec getSpec() throws Exception { return null; }

	}

}
