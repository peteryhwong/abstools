/* FeatureIDE - An IDE to support feature-oriented software development
 * Copyright (C) 2005-2012  FeatureIDE team, University of Magdeburg
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses/.
 *
 * See http://www.fosd.de/featureide/ for further information.
 */
package de.ovgu.featureide.ui.ahead.editors.jak;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

/**
 * 
 * @author Marcus Leich
 *
 */
public class JakPartitionScanner extends RuleBasedPartitionScanner {
	
	public final static String JAK_COMMENT = "__jak_comment";
	public final static String JAK_JAVADOC = "__jak_javadoc";
	public final static String JAK_CODE = "__jak_code";
	
	public final static String[] JAK_PARTITION_TYPES = new String[] {JAK_CODE, JAK_JAVADOC, JAK_COMMENT};

	public JakPartitionScanner() {
		IToken comment = new Token(JAK_COMMENT);
		IToken javadoc = new Token(JAK_JAVADOC);

		IPredicateRule[] rules = new IPredicateRule[3];

		rules[0] = new MultiLineRule("/**", "*/", javadoc);
		rules[1] = new MultiLineRule("/*", "*/", comment);
		rules[2] = new SingleLineRule("//", "\n", comment);
		
		setPredicateRules(rules);
	}

}
