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
package org.drools.workbench.screens.guided.dtable.client.widget.analysis.index;

public class Query {

    private Index index;

    public Query( final Index index ) {
        this.index = index;
    }


    public From from() {
        return new From();
    }

    public class From {

        public Rules rules() {
            return index.rules;
        }

        public Patterns patterns() {
            return index.patterns;
        }

        public Conditions conditions() {
            return index.conditions;
        }

        public Actions actions() {
            return index.actions;
        }
    }
}

