// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildOverridesConfig extends Bean {

	default String getKind() { return "BuildOverridesConfig"; }
	default String getApiVersion() { return "openshiftcontrolplane.config.openshift.io/v1"; }
	@YamlPropertyName(value="forcePull")
	Boolean getForcePull() throws Exception;

	@YamlPropertyName(value="imageLabels")
	List<ImageLabel> getImageLabels() throws Exception;

	@YamlPropertyName(value="nodeSelector")
	Map<String,String> getNodeSelector() throws Exception;

	@YamlPropertyName(value="annotations")
	Map<String,String> getAnnotations() throws Exception;

	@YamlPropertyName(value="tolerations")
	List<Toleration> getTolerations() throws Exception;

	interface EZ extends BuildOverridesConfig {

		@YamlPropertyName(value="forcePull")
		default Boolean getForcePull() throws Exception { return null; }

		@YamlPropertyName(value="imageLabels")
		default List<ImageLabel> getImageLabels() throws Exception { return null; }

		@YamlPropertyName(value="nodeSelector")
		default Map<String,String> getNodeSelector() throws Exception { return null; }

		@YamlPropertyName(value="annotations")
		default Map<String,String> getAnnotations() throws Exception { return null; }

		@YamlPropertyName(value="tolerations")
		default List<Toleration> getTolerations() throws Exception { return null; }

	}

}
