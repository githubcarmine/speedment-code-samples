/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.examples.hares;

import com.company.speedment.test.hare.db0.hares.hare.Hare;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 *
 * @author pemi
 */
public class TestOperators extends BaseDemo {

    public static void main(String[] args) {
        new TestOperators().test();
    }

    public void test() {

        hares.stream().forEachOrdered(System.out::println);

        final List<Predicate<Hare>> predicates = Arrays.asList(
                Hare.NAME.contains("er"),
                Hare.NAME.contains("eR"),
                Hare.NAME.endsWith("rra"),
                Hare.NAME.equalIgnoreCase("PerRA"),
                Hare.NAME.notEqualIgnoreCase("PerRA"),
                Hare.NAME.startsWith("H"),
                Hare.NAME.contains(null),
                Hare.NAME.endsWith(null),
                Hare.NAME.startsWith(null)
        );

        System.out.println("Testing operators");
        AtomicInteger i = new AtomicInteger();
        predicates.stream().forEachOrdered(p -> {
            System.out.println("Test " + i.getAndIncrement());
            hares.stream().filter(p).forEachOrdered(System.out::println);
        });

    }

}
