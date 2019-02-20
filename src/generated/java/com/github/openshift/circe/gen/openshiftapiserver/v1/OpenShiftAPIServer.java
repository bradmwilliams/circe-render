package com.github.openshift.circe.gen.openshiftapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftAPIServer extends Bean {

	default String getKind() { return "OpenShiftAPIServer"; }
	default String getApiVersion() { return "operator.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	OpenShiftAPIServerSpec getSpec() throws Exception;

	interface EZ extends OpenShiftAPIServer {

		@YamlPropertyName(value="spec")
		default OpenShiftAPIServerSpec getSpec() throws Exception { return null; }

	}

}
