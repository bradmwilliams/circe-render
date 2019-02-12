package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TokenConfig extends Bean {
	@YamlPropertyName(value="authorizeTokenMaxAgeSeconds")
	Long getAuthorizeTokenMaxAgeSeconds() throws Exception;

	@YamlPropertyName(value="accessTokenMaxAgeSeconds")
	Long getAccessTokenMaxAgeSeconds() throws Exception;

	@YamlPropertyName(value="accessTokenInactivityTimeoutSeconds")
	Long getAccessTokenInactivityTimeoutSeconds() throws Exception;

}