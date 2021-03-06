// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.console.v1.*;
import com.github.openshift.circe.gen.consoleoperator.v1.*;
import com.github.openshift.circe.beans.*;

public interface ConsoleUnit extends UnitBase {

	@RenderOrder(value ="0001")
	Console getConsole() throws Exception;

	@RenderOrder(value ="0002")
	ConsoleOperator getConsoleOperator() throws Exception;

	interface EZ extends ConsoleUnit {

		@RenderOrder(value ="0001")
		default Console getConsole() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default ConsoleOperator getConsoleOperator() throws Exception { return null; }

	}


}
