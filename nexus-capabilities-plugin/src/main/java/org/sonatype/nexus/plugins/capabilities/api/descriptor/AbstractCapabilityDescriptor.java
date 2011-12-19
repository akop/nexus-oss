/**
 * Copyright (c) 2008-2011 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions
 *
 * This program is free software: you can redistribute it and/or modify it only under the terms of the GNU Affero General
 * Public License Version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License Version 3
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License Version 3 along with this program.  If not, see
 * http://www.gnu.org/licenses.
 *
 * Sonatype Nexus (TM) Open Source Version is available from Sonatype, Inc. Sonatype and Sonatype Nexus are trademarks of
 * Sonatype, Inc. Apache Maven is a trademark of the Apache Foundation. M2Eclipse is a trademark of the Eclipse Foundation.
 * All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.plugins.capabilities.api.descriptor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.sonatype.nexus.formfields.FormField;
import org.sonatype.nexus.plugins.capabilities.api.CapabilityType;

/**
 * Support class for implementing {@link CapabilityDescriptor}s.
 *
 * @since 1.10.0
 */
public abstract class AbstractCapabilityDescriptor
    implements CapabilityDescriptor
{

    private final CapabilityType type;

    private final String name;

    private final String about;

    private final List<FormField> formFields;

    protected AbstractCapabilityDescriptor( final CapabilityType type,
                                            final String name,
                                            final String about,
                                            final FormField... formFields )
    {
        this.type = type;
        this.name = name;
        this.about = about;
        if ( formFields == null )
        {
            this.formFields = Collections.emptyList();
        }
        else
        {
            this.formFields = Arrays.asList( formFields );
        }
    }

    @Override
    public CapabilityType type()
    {
        return type;
    }

    @Override
    public String name()
    {
        return name;
    }

    @Override
    public String about()
    {
        return about;
    }

    @Override
    public List<FormField> formFields()
    {
        return formFields;
    }

    /**
     * Always exposed.
     *
     * @return true
     */
    @Override
    public boolean isExposed()
    {
        return true;
    }

}
