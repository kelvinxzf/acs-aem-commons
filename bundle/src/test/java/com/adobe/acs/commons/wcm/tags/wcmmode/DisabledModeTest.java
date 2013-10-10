/*
 * #%L
 * ACS AEM Commons Bundle
 * %%
 * Copyright (C) 2013 Adobe
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.adobe.acs.commons.wcm.tags.wcmmode;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.servlet.jsp.tagext.TagSupport;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.day.cq.wcm.api.WCMMode;

public class DisabledModeTest extends AbstractModeTest {

    @InjectMocks
    private DisabledMode tag = new DisabledMode();

    @Override
    AbstractMode getTag() {
        return tag;
    }

    @Override
    WCMMode getCorrectMode() {
        return WCMMode.DISABLED;
    }

    @Test
    public void test_with_null_wcmmode() throws Exception {
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, getTag().doStartTag());
    }

    @Test
    public void test_with_null_wcmmode_and_not() throws Exception  {
        getTag().setNot(true);
        assertEquals(TagSupport.SKIP_BODY, getTag().doStartTag());
    }

}