package com.github.openshift.circe.gen.project;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface TemplateReference extends Bean {
	//json:name
	String getName() throws Exception;
}