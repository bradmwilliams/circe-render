package com.github.openshift.circe.gen.tuned;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface Tuned extends Bean {
	default String getKind() { return "Tuned"; }
	default String getApiVersion() { return "v1alpha1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", "default"); }
	//json:spec
	TunedSpec getSpec() throws Exception;
}