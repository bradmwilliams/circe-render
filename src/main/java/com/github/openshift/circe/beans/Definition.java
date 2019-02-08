package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;
import com.github.openshift.circe.yaml.RenderOrder;

public interface Definition {

    /**
     * Allows each Definition to return a set of miscellaneous resources
     * which will be created alongside it. These resources will be created
     * before anything else in the definition.
     */
    @RenderOrder(value="0000")
    default KubeList<Bean> getPreMisc()  {
        return null;
    }

    /**
     * Allows each Definition to return a set of miscellaneous resources
     * which will be created alongside it. These resources will be created
     * after everything else in the definition.
     */
    @RenderOrder(value="9999")
    default KubeList<Bean> getPostMisc()  {
        return null;
    }

}