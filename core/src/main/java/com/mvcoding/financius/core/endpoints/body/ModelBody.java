/*
 * Copyright (C) 2015 Mantas Varnagiris.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.mvcoding.financius.core.endpoints.body;

import com.google.common.base.Strings;
import com.mvcoding.financius.core.endpoints.body.validation.CompositeException;
import com.mvcoding.financius.core.model.ModelState;

import static com.google.common.base.Preconditions.checkState;

public class ModelBody implements Body {
    private String id;
    private ModelState modelState;

    @Override public void validate() throws CompositeException {

        checkState(!Strings.isNullOrEmpty(id), "Id cannot be empty.");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelState getModelState() {
        return modelState;
    }

    public void setModelState(ModelState modelState) {
        this.modelState = modelState;
    }
}