package com.mossle.security.tag;

import com.mossle.security.util.SpringSecurityUtils;

public class LackRoleTag extends AbstractRoleTag {
    private static final long serialVersionUID = 0L;

    protected boolean checkRoles(String[] roles) {
        return SpringSecurityUtils.lackRole(roles);
    }
}
