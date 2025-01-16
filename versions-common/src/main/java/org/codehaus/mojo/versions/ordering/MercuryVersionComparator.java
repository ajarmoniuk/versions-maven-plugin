package org.codehaus.mojo.versions.ordering;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.StringTokenizer;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.ComparableVersion;

/**
 * A comparator which uses Mercury's version rules.
 *
 * @author Stephen Connolly
 * @since 1.0-alpha-3
 * @deprecated
 */
public class MercuryVersionComparator extends AbstractVersionComparator {

    /**
     * {@inheritDoc}
     */
    public int compare(ArtifactVersion o1, ArtifactVersion o2) {
        return new ComparableVersion(o1.toString()).compareTo(new ComparableVersion(o2.toString()));
    }

    protected int innerGetSegmentCount(ArtifactVersion v) {
        final String version = v.toString();
        StringTokenizer tok = new StringTokenizer(version, ".-");
        return tok.countTokens();
    }
}
