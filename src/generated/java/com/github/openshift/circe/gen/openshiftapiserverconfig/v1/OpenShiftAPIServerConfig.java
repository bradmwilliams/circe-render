// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftAPIServerConfig extends Bean {

	default String getKind() { return "OpenShiftAPIServerConfig"; }
	default String getApiVersion() { return "openshiftcontrolplane.config.openshift.io/v1"; }
	@YamlPropertyName(value="genericAPIServerConfig")
	@YamlPropertyInline
	GenericAPIServerConfig getGenericAPIServerConfig() throws Exception;

	@YamlPropertyName(value="aggregatorConfig")
	FrontProxyConfig getAggregatorConfig() throws Exception;

	@YamlPropertyName(value="imagePolicyConfig")
	ImagePolicyConfig getImagePolicyConfig() throws Exception;

	@YamlPropertyName(value="projectConfig")
	ProjectConfig getProjectConfig() throws Exception;

	@YamlPropertyName(value="routingConfig")
	RoutingConfig getRoutingConfig() throws Exception;

	@YamlPropertyName(value="serviceAccountOAuthGrantMethod")
	String getServiceAccountOAuthGrantMethod() throws Exception;

	@YamlPropertyName(value="jenkinsPipelineConfig")
	JenkinsPipelineConfig getJenkinsPipelineConfig() throws Exception;

	@YamlPropertyName(value="cloudProviderFile")
	String getCloudProviderFile() throws Exception;

	@YamlPropertyName(value="apiServerArguments")
	Map<String,List<String>> getAPIServerArguments() throws Exception;

	interface EZ extends OpenShiftAPIServerConfig {

		@YamlPropertyName(value="genericAPIServerConfig")
		@YamlPropertyInline
		default GenericAPIServerConfig getGenericAPIServerConfig() throws Exception { return null; }

		@YamlPropertyName(value="aggregatorConfig")
		default FrontProxyConfig getAggregatorConfig() throws Exception { return null; }

		@YamlPropertyName(value="imagePolicyConfig")
		default ImagePolicyConfig getImagePolicyConfig() throws Exception { return null; }

		@YamlPropertyName(value="projectConfig")
		default ProjectConfig getProjectConfig() throws Exception { return null; }

		@YamlPropertyName(value="routingConfig")
		default RoutingConfig getRoutingConfig() throws Exception { return null; }

		@YamlPropertyName(value="serviceAccountOAuthGrantMethod")
		default String getServiceAccountOAuthGrantMethod() throws Exception { return null; }

		@YamlPropertyName(value="jenkinsPipelineConfig")
		default JenkinsPipelineConfig getJenkinsPipelineConfig() throws Exception { return null; }

		@YamlPropertyName(value="cloudProviderFile")
		default String getCloudProviderFile() throws Exception { return null; }

		@YamlPropertyName(value="apiServerArguments")
		default Map<String,List<String>> getAPIServerArguments() throws Exception { return null; }

	}

}
