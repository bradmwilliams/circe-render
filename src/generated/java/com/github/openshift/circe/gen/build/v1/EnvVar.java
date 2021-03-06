// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EnvVar extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="valueFrom")
	EnvVarSource getValueFrom() throws Exception;

	interface EZ extends EnvVar {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="value")
		default String getValue() throws Exception { return null; }

		@YamlPropertyName(value="valueFrom")
		default EnvVarSource getValueFrom() throws Exception { return null; }

	}

}
