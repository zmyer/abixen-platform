/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.service.webcontent.application.form;

import com.abixen.platform.service.webcontent.application.dto.SimpleWebContentDto;

public class SimpleWebContentForm extends WebContentForm {

    public SimpleWebContentForm() {
    }

    public SimpleWebContentForm(SimpleWebContentDto simpleWebContent) {
        super(simpleWebContent);
    }
}