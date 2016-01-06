<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../layout/taglib.jsp"%>
<br />

<button type="button" class="btn btn-primary btn-lg" data-toggle="modal"
	data-target="#myModal">Dodaj rezerwacje</button>

<form:form commandName="rezerwacja" cssClass="form-horizontal">
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Nowa Rezerwacja</h4>
				</div>
				<div class="modal-body">


					<div class="form-group">
						<label for="data" class="col-sm-5 control-label">Data
							rezerwacji:</label>
						<div class="col-sm-6">
							<form:input path="data" cssClass="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label for="dataroz" class="col-sm-5 control-label">Godzina
							rozpoczęcia zajęć:</label>
						<div class="col-sm-6">
							<form:input path="dataroz" cssClass="form-control" />
						</div>
					</div>


					<div class="form-group">
						<label for="datazak" class="col-sm-5 control-label">Godzina
							zakończenia zajęć:</label>
						<div class="col-sm-6">
							<div class="form-group">
								<form:input path="datazak" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="cel" class="col-sm-5 control-label">Cel
								zajęć:</label>
							<div class="col-sm-6">
								<div class="form-group">
									<form:input path="cel" cssClass="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label for="sala" class="col-sm-5 control-label">Numer
									sali</label>
								<div class="col-sm-6">
									<div class="form-group">
										<form:input path="sala" cssClass="form-control" />
									</div>
								</div>


							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Zamknij</button>
								<input type="submit" class="btn btn-primary" value="Zapisz">

							</div>
						</div>
					</div>
				</div>
			</div>
			</div>
			</div>
</form:form>

<br />
<br />

<table class="table table-bordered table-haver table-striped">
	<thead>
		<tr>
			<th>Moje rezerwacje:</th>
		</tr>
		<tr>
			<th>Numer sali</th>
			<th>Data</th>
			<th>Godzina rozpoczęcia</th>
			<th>Godzina zkończenia</th>
			<th>Cel</th>
		</tr>

	</thead>

	<tbody>
		<c:forEach items="${rez}" var="rez">
			<tr>
				<td>${rez.sala}</td>
				<td>${rez.data}</td>
				<td>${rez.dataroz}</td>
				<td>${rez.datazak}</td>
				<td>${rez.cel}</td>

			</tr>

		</c:forEach>
	</tbody>
</table>
