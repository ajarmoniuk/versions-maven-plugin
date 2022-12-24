package org.codehaus.mojo.versions.change;

/*
 * Copyright MojoHaus and Contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import javax.xml.stream.XMLStreamException;

import org.codehaus.mojo.versions.api.change.DependencyVersionChange;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Stephen Connolly
 * @since 15-Sep-2010 15:59:00
 */
public interface VersionChanger {
    void apply(DependencyVersionChange versionChange) throws XMLStreamException;
}
