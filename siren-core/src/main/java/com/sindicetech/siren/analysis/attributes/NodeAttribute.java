/**
 * Copyright (c) 2014, Sindice Limited. All Rights Reserved.
 *
 * This file is part of the SIREn project.
 *
 * SIREn is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * SIREn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sindicetech.siren.analysis.attributes;

import org.apache.lucene.util.Attribute;
import org.apache.lucene.util.IntsRef;

/**
 * The node path of a token.
 */
public interface NodeAttribute extends Attribute {

  /**
   * Returns this Token's node path.
   */
  public IntsRef node();

  /**
   * Append a new node id to the node path
   */
  public void append(int nodeID);

  /**
   * Set the node path.
   * @see #node()
   */
  public void copyNode(IntsRef nodePath);

}
