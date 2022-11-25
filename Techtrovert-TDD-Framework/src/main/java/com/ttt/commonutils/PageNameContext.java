package com.ttt.commonutils;

import java.util.HashMap;

import com.ttt.enums.Context;
import com.ttt.enums.PageName;

public class PageNameContext {
    private HashMap<Context, Object> pageContext = new HashMap();
    
    
    public void setPageContext(Context key, Object value) {
    	 pageContext.put(key, value);
    }
    
    public Object getPageContext(Context key) {
    	return pageContext.get(key);
    }
}
