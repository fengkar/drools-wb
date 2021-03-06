/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.screens.guided.dtable.client.widget.analysis.cache;

import java.util.ArrayList;

public class InspectorList<T extends HasConflicts>
        extends ArrayList<T> {

    public ArrayList<T> hasConflicts() {
        for ( final T t : this ) {
            ArrayList<T> result = t.hasConflicts();
            if ( !result.isEmpty() ) {
                return result;
            }
        }
        return new ArrayList<>();
    }
}
