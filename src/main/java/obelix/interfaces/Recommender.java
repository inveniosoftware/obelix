/**
 * This file is part of Obelix.
 *
 * Obelix is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Obelix is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Obelix.  If not, see <http://www.gnu.org/licenses/>.
 */
package obelix.interfaces;

import graph.exceptions.ObelixNodeNotFoundException;

import java.util.Map;

public interface Recommender {
    Map<String, Double> recommend(String userID) throws ObelixNodeNotFoundException;
    Map<String, Double> recommend(String userID, String depth) throws ObelixNodeNotFoundException;
    Map<String, Double> recommend(String userID,
                                  String depth,
                                  String sinceTimestamp,
                                  String untilTimestamp,
                                  String importanceFactor) throws ObelixNodeNotFoundException;
}
