/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package red.zyc.desensitization.annotation;

import java.lang.annotation.*;


/**
 * 被注解的元素在运行期间需要擦除一些敏感信息。
 * <ul>
 *     <li>
 *         标注在方法上代表对该方法的返回值进行敏感信息擦除。
 *     </li>
 *     <li>
 *         标注在对象域上代表级联擦除该域中的敏感信息
 *     </li>
 * </ul>
 *
 * @author zyc
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE_USE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EraseSensitive {
}
