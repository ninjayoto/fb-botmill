/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.fb.model.incoming.callback;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;


/**
 * An object that represents the shipping address, used by the
 * {@link CheckoutUpdate} class.
 * 
 * @author Donato Rimenti
 * 
 */
public class ShippingAddress implements Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID of shipping address.
	 */
	private String id;

	/**
	 * Shipping address country.
	 */
	private String country;

	/**
	 * Shipping address city.
	 */
	private String city;

	/**
	 * Shipping address street, first line.
	 */
	private String street1;

	/**
	 * Shipping address street, second line.
	 */
	private String street2;

	/**
	 * Shipping address state.
	 */
	private String state;

	/**
	 * Shipping address postal code.
	 */
	@SerializedName("postal_code")
	private String postalCode;

	/**
	 * Gets the {@link #id}.
	 *
	 * @return the {@link #id}.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the {@link #id}.
	 *
	 * @param id
	 *            the {@link #id} to set.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the {@link #country}.
	 *
	 * @return the {@link #country}.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the {@link #country}.
	 *
	 * @param country
	 *            the {@link #country} to set.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the {@link #city}.
	 *
	 * @return the {@link #city}.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the {@link #city}.
	 *
	 * @param city
	 *            the {@link #city} to set.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the {@link #street1}.
	 *
	 * @return the {@link #street1}.
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * Sets the {@link #street1}.
	 *
	 * @param street1
	 *            the {@link #street1} to set.
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	/**
	 * Gets the {@link #street2}.
	 *
	 * @return the {@link #street2}.
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * Sets the {@link #street2}.
	 *
	 * @param street2
	 *            the {@link #street2} to set.
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * Gets the {@link #state}.
	 *
	 * @return the {@link #state}.
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the {@link #state}.
	 *
	 * @param state
	 *            the {@link #state} to set.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the {@link #postalCode}.
	 *
	 * @return the {@link #postalCode}.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the {@link #postalCode}.
	 *
	 * @param postalCode
	 *            the {@link #postalCode} to set.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
