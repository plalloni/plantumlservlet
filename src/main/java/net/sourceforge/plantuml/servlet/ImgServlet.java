/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * Project Info:  http://plantuml.sourceforge.net
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 */
package net.sourceforge.plantuml.servlet;

import net.sourceforge.plantuml.FileFormat;

/* 
 * Image servlet of the webapp.
 * This servlet produces the UML diagram in PNG format.
 */
@SuppressWarnings("serial")
public class ImgServlet extends UmlDiagramService {

    @Override
    public String getSource( String uri) {
        String[] result = uri.split("/img/", 2);
        if (result.length != 2) {
            return "";
        } else {
          return result[1];
        }
    }

    @Override
    public FileFormat getOutputFormat() {
        return FileFormat.PNG;
    }

}
