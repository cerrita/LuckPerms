/*
 * This file is part of LuckPerms, licensed under the MIT License.
 *
 *  Copyright (c) lucko (Luck) <luck@lucko.me>
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package me.lucko.luckperms.common.metastacking;

import me.lucko.luckperms.api.LocalizedNode;
import me.lucko.luckperms.api.metastacking.MetaStackElement;

import java.util.Map;
import java.util.Optional;

/**
 * Represents a specific entry in a {@link MetaStack}.
 * An entry is basically a live/mutable version of a {@link MetaStackElement}.
 */
public interface MetaStackEntry {

    /**
     * Gets the stack this entry belongs to.
     *
     * @return the parent stack
     */
    MetaStack getParentStack();

    /**
     * Gets the element this entry was formed form
     *
     * @return the forming element
     */
    MetaStackElement getElement();

    /**
     * Gets the value currently held by this entry.
     *
     * @return the entry
     */
    Optional<Map.Entry<Integer, String>> getCurrentValue();

    /**
     * Accumulates a node to this entry
     *
     * @param node the node to accumulate
     * @return if the node was accepted
     */
    boolean accumulateNode(LocalizedNode node);

}
